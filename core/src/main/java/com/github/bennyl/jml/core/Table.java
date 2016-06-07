/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core;

import java.io.PrintStream;
import one.util.streamex.IntStreamEx;
import one.util.streamex.StreamEx;

/**
 * TODO - implement transpose
 *
 * @author bennyl
 */
public interface Table extends Dataset {

    int numRows();

    int numCols();

    Vector row(int i);

    Vector col(int i);

    void appendRow(Vector v);

    void appendColumn(Vector v);

    void set(int i, int j, double v);

    default StreamEx<Vector> rows() {
        return IntStreamEx.range(0, numRows()).mapToObj(this::row);
    }

    default StreamEx<Vector> cols() {
        return IntStreamEx.range(0, numCols()).mapToObj(this::col);
    }

    /**
     * @param row
     * @param col
     * @return the value at {@code row\col}
     */
    double get(int row, int col);

    default Table setRow(int i, double... colValues) {
        if (colValues.length != numCols()) {
            throw new UnsupportedOperationException("num given columns differ from num columns in table");
        }

        for (int j = 0; j < colValues.length; j++) {
            set(i, j, colValues[j]);
        }

        return this;
    }

    @Override
    public default HyperCube asHyperCube() {
        throw new UnsupportedOperationException("unable to convert table to hyper cube");
    }

    @Override
    public default Table asTable() {
        return this;
    }

    @Override
    public default Vector asVector() {
        throw new UnsupportedOperationException("unable to convert table to vector");
    }

    @Override
    public default void print(PrintStream out) {
        for (Vector row : rows()) {
            row.print(out);
            out.println();
        }
    }

}
