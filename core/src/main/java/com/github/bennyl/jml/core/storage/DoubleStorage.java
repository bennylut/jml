/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.storage;

/**
 *
 * @author bennyl
 */
public interface DoubleStorage {

    void put(int index, double value);

    void put(int i, int j, double value);

    void put(int[] indexes, double value);

    /**
     * @return the total number of cells in the dataset
     */
    int size();

    /**
     * @param dimension
     * @return the amount of cells in the given dimension
     */
    default int size(int dimension) {
        return shape()[dimension];
    }

    /**
     * @return the number of dimensions in this dataset
     */
    default int dimensions() {
        return shape().length;
    }

    double get(int i);

    double get(int i, int j);

    double get(int... pos);

    int[] shape();
    
    void reshape(int... shape);
}
