/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ds;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.Vector;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

/**
 *
 * @author bennyl
 */
public class DoubleArrayVector implements Vector {

    private final DoubleList vector;
    private final Dataset parent;

    public DoubleArrayVector(Dataset parent) {
        this.parent = parent;
        this.vector = new DoubleArrayList();
    }

    public DoubleArrayVector(Dataset parent, int size) {
        this.parent = parent;
        this.vector = new DoubleArrayList(size);
        this.vector.size(size);
    }

    public DoubleArrayVector(Dataset parent, Vector copy) {
        this.parent = parent;
        this.vector = new DoubleArrayList(copy.length());
        copy.doubleValues().forEach(vector::add);
    }

    @Override
    public int length() {
        return vector.size();
    }

    @Override
    public double getDouble(int i) {
        return vector.getDouble(i);
    }

    @Override
    public void setDouble(int i, double v) {
        vector.set(i, v);
    }

    @Override
    public Dataset parent() {
        return parent;
    }

    @Override
    public String toString() {
        return vector.toString();
    }

    @Override
    public void append(double d) {
        vector.add(d);
    }

}
