/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.example;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.impl.ds.SimpleDataset;
import com.github.bennyl.jml.core.impl.storage.DoubleArrayStorage;

/**
 *
 * @author bennyl
 */
public class ProgramaticallyPopulateDataset {

    public static void main(String[] args) {
        int n = 10000000;
        Dataset dataset = new SimpleDataset(new DoubleArrayStorage(new double[n]));

        for (int i = 0; i < dataset.size(); i++) {
            dataset.put(i, i);
        }

        double s = 0;
        for (int i = 0; i < 1000; i++) {
            s += dataset.sum();
        }

        System.out.println("total sum is: " + s);
    }
}
