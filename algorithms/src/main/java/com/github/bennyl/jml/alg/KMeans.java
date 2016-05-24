/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.alg;

import com.github.bennyl.jml.alg.models.Clusters;
import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.Learner;
import com.github.bennyl.jml.core.LearnerParams;
import java.util.Random;

/**
 *
 * @author bennyl
 */
public class KMeans implements Learner<KMeans.Params, Clusters> {

    @Override
    public Clusters learn(Params params, Dataset dataset) {
        Random random = new Random(params.seed);
        for (int i = 0; i < params.maxIterations; i++) {
            //STOPPED HERE
        }
        
        return null;
    }

    public static class Params extends LearnerParams<Clusters> {

        private int k;
        private int maxIterations;
        private int seed = (int) System.currentTimeMillis();

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
            if (dataset.dimensions() != 2) {
                errors.append("only support datasets with 2 dimentions");
            }

            if (dataset.size(0) < k) {
                k = dataset.size(0);
            }

            return errors.length() == 0 ? null : errors.toString();
        }

    }
}
