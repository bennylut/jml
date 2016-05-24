/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.example;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.impl.ds.ByteBufferDataset;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *
 * @author bennyl
 */
public class SaveAndLoadDataset {

    public static void main(String[] args) throws IOException {
        Dataset dataset = new ByteBufferDataset(100);
        for (int i = 0; i < dataset.size(); i++) {
            dataset.put(i, i);
        }

        double before = dataset.sum();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        dataset.save(out);
        out.close();

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        dataset = ByteBufferDataset.load(in);

        double after = dataset.sum();

        System.out.println("before: " + before + ", after: " + after);
    }
}
