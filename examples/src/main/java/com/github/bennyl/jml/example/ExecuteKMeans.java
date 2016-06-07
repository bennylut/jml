/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.example;

import com.github.bennyl.jml.alg.KMeans;
import com.github.bennyl.jml.alg.models.Clusters;
import com.github.bennyl.jml.core.Table;
import com.github.bennyl.jml.core.impl.ds.SimpleDataset;
import java.util.Arrays;

/**
 *
 * @author bennyl
 */
public class ExecuteKMeans {

    public static void main(String[] args) {
        Table t = new SimpleDataset(4, 3).asTable();
        t.setRow(0, 1, 1, 1);
        t.setRow(1, 8, 12, 8);
        t.setRow(2, 2, 2, 1);
        t.setRow(3, 12, 8, 7);

        Clusters model = t.learn(KMeans.class)
                .k(2)
                .start();

        System.out.println("centroids: " + Arrays.toString(model.getCentroids()));
        System.out.println("participants: ");
        System.out.println(Arrays.toString(model.getInstancesAssignment()));
    }
}
