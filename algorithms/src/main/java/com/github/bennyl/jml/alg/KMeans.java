/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.alg;

import com.github.bennyl.jml.alg.func.DistanceFunction2D;
import com.github.bennyl.jml.alg.models.Clusters;
import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.Learner;
import com.github.bennyl.jml.core.LearnerParams;
import com.github.bennyl.jml.core.Table;
import com.github.bennyl.jml.core.Vector;
import com.github.bennyl.jml.core.impl.ds.DoubleArrayVector;
import com.github.bennyl.jml.core.views.InstancesStore;
import com.github.bennyl.jml.utils.MathUtil;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.ints.IntList;
import static java.lang.Double.POSITIVE_INFINITY;
import java.util.Random;

/**
 * a kmeans implementation mostly taken from
 * http://www.cs.huji.ac.il/~shashua/papers/class9-clustering.pdf
 *
 * @author bennyl
 */
public class KMeans implements Learner<KMeans.Params, Clusters> {

    @Override
    public Clusters learn(Params params, Dataset dataset) {

        InstancesStore instances = dataset.getInstanceOf(InstancesStore.class);

        Random random = new Random(params.seed);
        Cluster[] bestClusters = null;
        double bestFitness = POSITIVE_INFINITY;
        int k = params.k;

        for (int init = 0; init < params.nInit; init++) {
            Cluster[] clusters = new Cluster[k];
            double fitness = Double.POSITIVE_INFINITY;

            //1. create k random empty clusters
            IntIterator it = MathUtil.chooseFromRange(0, instances.numInstances(), k, random).iterator();
            for (int i = 0; i < k; i++) {
                clusters[i] = new Cluster(instances.instance(it.nextInt()));
            }

            //2. run kmeans
            for (int i = 0; i < params.maxIterations; i++) {

                //2.1 reset clusters
                for (Cluster c : clusters) {
                    c.resetInstances();
                }

                //2.2 assign each instance to its closest cluster
                for (int instanceIdx = 0; instanceIdx < instances.numInstances(); instanceIdx++) {
                    Vector instance = instances.instance(instanceIdx);
                    int bestAssignment = 0;
                    double bestDistance = Double.POSITIVE_INFINITY;
                    for (int j = 0; j < clusters.length; j++) {
                        double dist = params.dist.distance(instance, clusters[j].centroid);
                        if (dist < bestDistance) {
                            bestAssignment = j;
                            bestDistance = dist;
                        }
                    }

                    clusters[bestAssignment].addInstance(instanceIdx);
                }

                //2.3 adjust clusters
                double currentFitness = 0;
                for (Cluster cluster : clusters) {
                    cluster.adjust(instances);
                    currentFitness += cluster.fitness;
                }

                //2.4 check if should continue
                if (fitness - currentFitness > params.convergenceEpsilon) {
                    fitness = currentFitness;
                } else {
                    break;
                }
            }

            //3. check if thie iteration produced better results
            if (fitness < bestFitness) {
                bestFitness = fitness;
                bestClusters = clusters;
            }
        }

        int[] instanceAssignement = new int[instances.numInstances()];
        Vector[] centroids = new Vector[k];
        for (int i = 0; i < k; i++) {
            Cluster cluster = bestClusters[i];
            for (int j = 0; j < cluster.instances.size(); j++) {
                instanceAssignement[cluster.instances.get(j)] = i;
            }
            centroids[i] = cluster.centroid;
        }

        return new Clusters(instanceAssignement, centroids);
    }

    private double fitness(Cluster[] clusters) {
        return -1;
    }

    public static class Params extends LearnerParams<Clusters> {

        private int k = 8;
        private int maxIterations = 300;
        private int seed = (int) System.currentTimeMillis();
        private int nInit = 10;
        private double convergenceEpsilon = 1e-4;
        private DistanceFunction2D dist = DistanceFunction2D.euclidian();

        public Params k(int k) {
            this.k = k;
            return this;
        }

        public Params maxIterations(int maxIterations) {
            this.maxIterations = maxIterations;
            return this;
        }

        public Params seed(int seed) {
            this.seed = seed;
            return this;
        }

        @Override
        protected String validate() {
            StringBuilder errors = new StringBuilder();

            if (k <= 0) {
                errors.append("k must be larger than 0\n");
            }
            if (maxIterations <= 0) {
                errors.append("maxIterations must be larger than 0\n");
            }

            final Table table = dataset.asTable();
            if (table.numRows() < k) {
                k = table.numRows();
            }

            return errors.length() == 0 ? null : errors.toString();
        }
    }

    public static class Cluster {

        double fitness = 0;
        IntList instances = new IntArrayList();
        Vector centroid;

        public Cluster(Vector centroid) {
            this.centroid = centroid.copy();
        }

        private void adjust(InstancesStore instancesStore) {
            //first adjust the centroid
            centroid.clear();

            for (int i = 0; i < instances.size(); i++) {
                centroid.incrementBy(instancesStore.instance(instances.get(i)));
            }
            centroid.divideBy(instances.size());

            fitness = 0;

            for (int i = 0; i < instances.size(); i++) {
                Vector v = instancesStore.instance(instances.getInt(i));
                for (int j = 0; j < centroid.length(); j++) {
                    double dif = centroid.getDouble(j) - v.getDouble(j);
                    fitness += dif * dif;
                }
            }
        }

        private void resetInstances() {
            this.instances.clear();
            fitness = 0;
        }

        private void addInstance(int instance) {
            this.instances.add(instance);
        }

    }
}
