/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core;

import com.github.bennyl.jml.core.services.DatasetMetadataService;
import java.io.PrintStream;
import java.util.Objects;
import java.util.function.Supplier;
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

    void setDouble(int i, int j, double v);

    /**
     * @param row
     * @param col
     * @return the value at {@code row\col}
     */
    double getDouble(int row, int col);

    default long getLong(int row, int col) {
        return (long) getDouble(row, col);
    }

    default void setLong(int row, int col, long v) {
        setDouble(row, col, v);
    }

    default StreamEx<Vector> rows() {
        return IntStreamEx.range(0, numRows()).mapToObj(this::row);
    }

    default StreamEx<Vector> cols() {
        return IntStreamEx.range(0, numCols()).mapToObj(this::col);
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

    default void setRowId(int row, Object id) {
        getInstanceOf(DatasetMetadataService.class).store(new RowVectorMetaKey(id), () -> row(row));
    }

    default Vector rowById(Object id) {
        return getInstanceOf(DatasetMetadataService.class).fetch(new ColumnVectorMetaKey(id)).get();
    }

    default void setColId(int row, Object id) {
        getInstanceOf(DatasetMetadataService.class).store(new ColumnVectorMetaKey(id), () -> col(row));
    }

    default Vector colById(Object id) {
        return getInstanceOf(DatasetMetadataService.class).fetch(new RowVectorMetaKey(id)).get();
    }

    public static class RowVectorMetaKey implements DatasetMetadataService.MetaKey<Supplier<Vector>> {

        private Object id;

        public RowVectorMetaKey(Object id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 67 * hash + Objects.hashCode(this.id);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final RowVectorMetaKey other = (RowVectorMetaKey) obj;
            if (!Objects.equals(this.id, other.id)) {
                return false;
            }
            return true;
        }

    }

    public static class ColumnVectorMetaKey implements DatasetMetadataService.MetaKey<Supplier<Vector>> {

        private Object id;

        public ColumnVectorMetaKey(Object id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 67 * hash + Objects.hashCode(this.id);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final RowVectorMetaKey other = (RowVectorMetaKey) obj;
            if (!Objects.equals(this.id, other.id)) {
                return false;
            }
            return true;
        }

    }

}
