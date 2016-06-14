/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ds;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.Vector;
import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;

/**
 *
 * @author bennyl
 */
public class SparseLongVector implements Vector {

    private Dataset parent;
    private Int2LongOpenHashMap vector = new Int2LongOpenHashMap();

    public SparseLongVector(Dataset parent) {
        this.parent = parent;
    }

    @Override
    public int length() {
        return vector.size();
    }

    @Override
    public long getLong(int i) {
        return vector.get(i);
    }

    @Override
    public void setLong(int i, long v) {
        vector.put(i, v);
    }

    @Override
    public double getDouble(int i) {
        return vector.get(i);
    }

    @Override
    public void setDouble(int i, double v) {
        vector.put(i, (long) v);
    }

    @Override
    public void append(double d) {
        vector.put(vector.size(), (long) d);
    }

    @Override
    public void appendLong(long d) {
        vector.put(vector.size(), d);
    }

    @Override
    public Dataset parent() {
        return parent;
    }

}
