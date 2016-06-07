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
import java.util.ArrayList;

/**
 *
 * @author bennyl
 */
public class ColumnBasedTable implements Table {

    private ArrayList<Vector> table;
    private Dataset parent;

    public ColumnBasedTable(ArrayList<Vector> table, Dataset parent) {
        this.table = table;
        this.parent = parent;
    }

    @Override
    public int numRows() {
        if (table.isEmpty()) {
            return 0;
        }
        return table.get(0).length();
    }

    @Override
    public int numCols() {
        return table.size();
    }

    @Override
    public Vector row(int i) {
        return new TableRowVector(VectorValueType.VARIED, i, this);
    }

    @Override
    public Vector col(int i) {
        return table.get(i);
    }

    @Override
    public void appendRow(Vector v) {
        for (int c = 0; c < v.length(); c++) {
            col(c).append(v.getDouble(c));
        }
    }

    @Override
    public void set(int i, int j, double v) {
        col(j).setDouble(i, v);
    }

    @Override
    public double get(int i, int j) {
        return col(j).getDouble(i);
    }

    @Override
    public Dataset parent() {
        return parent;
    }

    @Override
    public void appendColumn(Vector v) {
        table.add(v);
    }

}
