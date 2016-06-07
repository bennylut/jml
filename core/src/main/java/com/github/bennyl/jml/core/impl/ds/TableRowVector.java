/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ds;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.Table;
import com.github.bennyl.jml.core.Vector;
import com.github.bennyl.jml.core.VectorValueType;

/**
 *
 * @author bennyl
 */
public class TableRowVector implements Vector {

    private VectorValueType type;
    private int index;
    private Table table;

    public TableRowVector(VectorValueType type, int index, Table table) {
        this.type = type;
        this.index = index;
        this.table = table;
    }

    @Override
    public int length() {
        return table.numCols();
    }

    @Override
    public double getDouble(int i) {
        return table.get(index, i);
    }

    @Override
    public void setDouble(int i, double v) {
        table.set(index, i, v);
    }

    @Override
    public void append(double d) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Dataset parent() {
        return table;
    }

}
