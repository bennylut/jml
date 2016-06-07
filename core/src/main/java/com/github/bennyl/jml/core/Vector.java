/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core;

import com.github.bennyl.jml.core.impl.ds.DoubleArrayVector;
import java.io.PrintStream;
import java.util.stream.Stream;
import one.util.streamex.DoubleStreamEx;
import one.util.streamex.IntStreamEx;
import one.util.streamex.StreamEx;

/**
 *
 * @author bennyl
 */
public interface Vector extends Dataset {

    int length();

    default Object get(int i) {
        return type().get(this, i);
    }

    default void set(int i, Object v) {
        type().set(this, i, v);
    }

    double getDouble(int i);

    default int getInt(int i) {
        return (int) getDouble(i);
    }

    default long getLong(int i) {
        return (long) getDouble(i);
    }

    void setDouble(int i, double v);

    default void setInt(int i, int v) {
        setDouble(i, v);
    }

    default void setLong(int i, long v) {
        setDouble(i, v);
    }

    default DoubleStreamEx doubleValues() {
        return IntStreamEx.range(0, length()).mapToDouble(this::getDouble);
    }

    default StreamEx<Object> values() {
        return IntStreamEx.range(0, length()).mapToObj(this::get);
    }

    default Vector copy() {
        return new DoubleArrayVector(null, this);
    }

    default void clear() {
        for (int i = 0; i < length(); i++) {
            setDouble(i, 0);
        }
    }

    default void incrementBy(Vector other) {
        if (length() != other.length()) {
            throw new UnsupportedOperationException("different length vectors");
        }

        for (int i = 0; i < length(); i++) {
            setDouble(i, getDouble(i) + other.getDouble(i));
        }
    }

    default void divideBy(double scalar) {
        for (int i = 0; i < length(); i++) {
            setDouble(i, getDouble(i) / scalar);
        }
    }

    default void divideBy(Vector other) {
        if (length() != other.length()) {
            throw new UnsupportedOperationException("different length vectors");
        }

        for (int i = 0; i < length(); i++) {
            setDouble(i, getDouble(i) / other.getDouble(i));
        }
    }

    default VectorValueType type() {
        return VectorValueType.NUMMERIC_DOUBLE;
    }

    default VectorValueType type(int element) {
        return type();
    }

    default Object getNominal(int i) {
        throw new UnsupportedOperationException("not nominal vector");
    }

    default void setNominal(int i, Object o) {
        throw new UnsupportedOperationException("not nominal vector");
    }

    default Stream<Object> nominalValues() {
        throw new UnsupportedOperationException("not nominal vector");
    }

    void append(double d);

    default void appendInt(int d) {
        append(d);
    }

    default void appendLong(long d) {
        append(d);
    }

    default void appendNominal(Object o) {
        throw new UnsupportedOperationException("not nominal vector");
    }

    @Override
    public default HyperCube asHyperCube() {
        throw new UnsupportedOperationException("unable to convert vector to hyper cube");
    }

    @Override
    public default Table asTable() {
        throw new UnsupportedOperationException("unable to convert vector to table");
    }

    @Override
    public default Vector asVector() {
        return this;
    }

    @Override
    public default void print(PrintStream out) {
        out.print("[");
        int idx = 0;
        for (Object v : values()) {
            out.print(v);
            if (idx + 1 != length()) {
                out.print(", ");
            }
        }
        out.print("]");
    }

}
