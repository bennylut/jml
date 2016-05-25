/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.views;

import java.util.Arrays;

/**
 *
 * @author bennyl
 */
public class DoubleArrayVector implements Vector {

    private double[] vector;

    public DoubleArrayVector(Vector copy) {
        this(new double[copy.length()]);
        copyFrom(copy);
    }

    public DoubleArrayVector(double[] vector) {
        this.vector = vector;
    }

    @Override
    public double get(int i) {
        return vector[i];
    }

    @Override
    public int length() {
        return vector.length;
    }

    @Override
    public void put(int i, double d) {
        vector[i] = d;
    }

    public double[] getArray() {
        return vector;
    }

    @Override
    public String toString() {
        return Arrays.toString(vector);
    }

}
