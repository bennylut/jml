/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ds;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.Table;
import com.github.bennyl.jml.core.Vector;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;

/**
 *
 * @author bennyl
 */
public class SparseLongTable implements Table {

    private int numRows = 0;
    private int numCols = 0;
    private Long2LongOpenHashMap table = new Long2LongOpenHashMap();
    private Dataset parent;

    public SparseLongTable(Dataset parent) {
        this.parent = parent;
        this.table.defaultReturnValue(0);
        if (parent == null) {
            parent = new SimpleDataset(this);
        }
    }

    public SparseLongTable() {
        //TODO: THIS IS AN UGLY SOLUTION - FIND A BETTER ONE!
        this(null);
    }

    public int numRows() {
        return numRows;
    }

    public int numCols() {
        return numCols;
    }

    public Vector row(int i) {
        return new ProxyVector(true, i);
    }

    public Vector col(int i) {
        return new ProxyVector(false, i);
    }

    public void appendRow(Vector v) {
        int index = numRows;
        for (int i = 0; i < v.length(); i++) {
            setLong(index, i, v.getLong(i));
        }
    }

    public void appendColumn(Vector v) {
        int index = numCols;
        for (int i = 0; i < v.length(); i++) {
            setLong(i, index, v.getLong(i));
        }
    }

    @Override
    public void setLong(int row, int col, long v) {
        if (row >= numRows) {
            numRows = row + 1;
        }
        if (col >= numCols) {
            numCols = col + 1;
        }

        table.put(key(row, col), v);
    }

    @Override
    public long getLong(int row, int col) {
        return table.get(key(row, col));
    }

    public void setDouble(int i, int j, double v) {
        setLong(i, j, (long) v);
    }

    private long key(int row, int col) {
        long key = row;
        key = key << 32;
        key += col;
        return key;
    }

    public double getDouble(int row, int col) {
        return getLong(row, col);
    }

    @Override
    public Dataset parent() {
        return parent;
    }

    private final class ProxyVector implements Vector {

        private boolean row;
        private int index;

        public ProxyVector(boolean row, int index) {
            this.row = row;
            this.index = index;
        }

        @Override
        public int length() {
            return row ? numRows() : numCols();
        }

        @Override
        public double getDouble(int i) {

            return row ? SparseLongTable.this.getDouble(index, i) : SparseLongTable.this.getDouble(i, index);
        }

        @Override
        public void setDouble(int i, double v) {
            if (row) {
                SparseLongTable.this.setDouble(index, i, v);
            } else {
                SparseLongTable.this.setDouble(i, index, v);
            }
        }

        @Override
        public void append(double d) {
            setDouble(length(), d);
        }

        @Override
        public Dataset parent() {
            return SparseLongTable.this;
        }

    }

}
