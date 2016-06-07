/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.example;

import com.github.bennyl.jml.alg.KMeans;
import com.github.bennyl.jml.alg.models.Clusters;
import com.github.bennyl.jml.core.Table;
import com.github.bennyl.jml.core.loaders.DatasetLoader;
import com.github.bennyl.jml.core.loaders.common.Csv;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author bennyl
 */
public class LoadFromCSV {

    public static void main(String[] args) throws IOException {
        Table t = DatasetLoader.of(Csv.class)
                .loadFrom(new File("/home/bennyl/projects/jml/datasets/iris.data"))
                .asTable();

        t.println();

        Clusters model = t.learn(KMeans.class)
                .k(3)
                .start();

        System.out.println("centroids: " + Arrays.toString(model.getCentroids()));
        System.out.println("participants: ");
        System.out.println(Arrays.toString(model.getInstancesAssignment()));
    }
}
