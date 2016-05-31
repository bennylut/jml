/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.storage;

import com.github.bennyl.jml.core.storage.DoubleStorage;

/**
 *
 * @author bennyl
 */
public class DoubleArrayStorage implements DoubleStorage {

    private double[] array;
    private int[] shape;

    public DoubleArrayStorage(double[] array) {
        this.array = array;
        shape = new int[]{array.length};
    }

    @Override
    public void put(int index, double value) {
        array[index] = value;
    }

    @Override
    public void put(int i, int j, double value) {
        throw new IllegalArgumentException("unsutable shape.");
    }

    @Override
    public void put(int[] indexes, double value) {
        if (indexes.length == 1) {
            put(indexes[0], value);
        } else {
            throw new IllegalArgumentException("unsutable shape.");
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public double get(int i) {
        return array[i];
    }

    @Override
    public double get(int i, int j) {
        throw new IllegalArgumentException("unsutable shape.");
    }

    @Override
    public double get(int... pos) {
        if (pos.length == 1) {
            return array[pos[0]];
        }

        throw new IllegalArgumentException("unsutable shape.");
    }

    @Override
    public int[] shape() {
        return shape;
    }

    @Override
    public void reshape(int... shape) {
        if (shape.length != 1) {
            throw new IllegalArgumentException("unsutable shape.");
        }

        this.array = new double[shape[0]];
        this.shape = shape;
    }
}
