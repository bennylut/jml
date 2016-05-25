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
public class DoubleMatrixStorage implements DoubleStorage {

    double[][] matrix;
    int[] shape;

    public DoubleMatrixStorage(double[][] matrix) {
        this.matrix = matrix;
        shape = new int[]{matrix.length, matrix[0].length};
    }

    @Override
    public void put(int index, double value) {
        throw new IllegalArgumentException("unsutable shape.");
    }

    @Override
    public void put(int i, int j, double value) {
        matrix[i][j] = value;
    }

    @Override
    public void put(int[] indexes, double value) {
        if (indexes.length == 2) {
            put(indexes[0], indexes[1], value);
        } else {
            throw new IllegalArgumentException("unsutable shape.");
        }
    }

    @Override
    public int size() {
        return matrix.length * matrix[0].length;
    }

    @Override
    public double get(int i) {
        throw new IllegalArgumentException("unsutable shape.");
    }

    @Override
    public double get(int i, int j) {
        return matrix[i][j];
    }

    @Override
    public double get(int... pos) {
        if (pos.length == 2) {
            return get(pos[0], pos[1]);
        } else {
            throw new IllegalArgumentException("unsutable shape.");
        }
    }

    @Override
    public int[] shape() {
        return shape;
    }

}
