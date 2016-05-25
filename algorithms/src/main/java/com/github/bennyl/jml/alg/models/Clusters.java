/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.alg.models;

import com.github.bennyl.jml.core.Model;
import com.github.bennyl.jml.core.views.Vector;

/**
 *
 * @author bennyl
 */
public class Clusters implements Model {

    private int[] instancesAssignment;
    private Vector[] centroids;

    public Clusters(int[] instancesAssignment, Vector[] centroids) {
        this.instancesAssignment = instancesAssignment;
        this.centroids = centroids;
    }

    public Vector[] getCentroids() {
        return centroids;
    }

    public int[] getInstancesAssignment() {
        return instancesAssignment;
    }

}
