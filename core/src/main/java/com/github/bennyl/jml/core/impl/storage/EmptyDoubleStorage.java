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
public class EmptyDoubleStorage implements DoubleStorage {

    @Override
    public void put(int index, double value) {
        throw new UnsupportedOperationException("Not supported on empty storage");
    }

    @Override
    public void put(int i, int j, double value) {
        throw new UnsupportedOperationException("Not supported on empty storage");
    }

    @Override
    public void put(int[] indexes, double value) {
        throw new UnsupportedOperationException("Not supported on empty storage");
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public double get(int i) {
        throw new UnsupportedOperationException("Not supported on empty storage");
    }

    @Override
    public double get(int i, int j) {
        throw new UnsupportedOperationException("Not supported on empty storage");
    }

    @Override
    public double get(int... pos) {
        throw new UnsupportedOperationException("Not supported on empty storage");
    }

    @Override
    public int[] shape() {
        return new int[0];
    }

    @Override
    public void reshape(int... shape) {
        throw new UnsupportedOperationException("Not supported on empty storage");
    }

}
