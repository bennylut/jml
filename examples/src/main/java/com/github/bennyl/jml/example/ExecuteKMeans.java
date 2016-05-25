/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.example;

import com.github.bennyl.jml.alg.KMeans;
import com.github.bennyl.jml.alg.models.Clusters;
import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.impl.ds.SimpleDataset;
import com.github.bennyl.jml.core.impl.storage.DoubleMatrixStorage;
import java.util.Arrays;

/**
 *
 * @author bennyl
 */
public class ExecuteKMeans {

    public static void main(String[] args) {
        double[][] matrix = {
            {1, 1, 1},
            {8, 12, 8},
            {2, 2, 1},
            {12, 8, 7}
        };

        Dataset dataset = new SimpleDataset(new DoubleMatrixStorage(matrix));
        Clusters model = dataset.learn(KMeans.class)
                .k(2)
                .start();

        System.out.println("centroids: " + Arrays.toString(model.getCentroids()));
        System.out.println("participants: ");
        System.out.println(Arrays.toString(model.getInstancesAssignment()));
    }
}
