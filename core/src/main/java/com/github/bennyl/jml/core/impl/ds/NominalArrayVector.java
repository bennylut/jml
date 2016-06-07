/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ds;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.HyperCube;
import com.github.bennyl.jml.core.Table;
import com.github.bennyl.jml.core.Vector;
import com.github.bennyl.jml.core.VectorValueType;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author bennyl
 */
public class NominalArrayVector implements Vector {

    private Dataset parent;
    private Object2IntMap<Object> factors = new Object2IntOpenHashMap<>();
    private ArrayList<Object> values = new ArrayList<>();

    public NominalArrayVector(Dataset parent) {
        this.parent = parent;
        this.factors.defaultReturnValue(0);
    }

    @Override
    public int length() {
        return values.size();
    }

    @Override
    public double getDouble(int i) {
        return factors.get(values.get(i));
    }

    @Override
    public void setDouble(int i, double v) {
        throw new UnsupportedOperationException("Not supported for a nominal vector.");
    }

    @Override
    public Dataset parent() {
        return parent;
    }

    @Override
    public VectorValueType type() {
        return VectorValueType.NOMINAL;
    }

    @Override
    public Object getNominal(int i) {
        return values.get(i);
    }

    @Override
    public void setNominal(int i, Object o) {
        int factor = factors.getInt(o);

        if (factor == 0) {
            factors.put(o, factors.size() + 1);
        }

        this.values.set(i, o);
    }

    @Override
    public Stream<Object> nominalValues() {
        return factors.keySet().stream();
    }

    @Override
    public void append(double d) {
        throw new UnsupportedOperationException("Not supported for a nominal vector.");
    }

    @Override
    public void appendNominal(Object o) {
        values.add(null);
        setNominal(values.size() - 1, o);
    }

}
