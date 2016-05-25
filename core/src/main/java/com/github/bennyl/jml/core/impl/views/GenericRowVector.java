/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.views;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.views.Vector;

/**
 *
 * @author bennyl
 */
public class GenericRowVector implements Vector {

    private Dataset dataset;
    private int row;

    public GenericRowVector(Dataset dataset, int row) {
        this.dataset = dataset;
        this.row = row;
    }

    @Override
    public double get(int i) {
        return dataset.get(row, i);
    }

    @Override
    public int length() {
        return dataset.dimensions();
    }

    @Override
    public void put(int i, double d) {
        dataset.put(i, d);
    }

}
