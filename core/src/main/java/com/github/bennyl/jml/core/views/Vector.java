/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.views;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 *
 * @author bennyl
 */
public interface Vector {

    double get(int i);

    int length();

    void put(int i, double d);

    /**
     * @param v
     * @return a new vector which holds the value of {@code this - v}, this
     * vector is not effected in the process
     */
    default Vector minus(Vector v) {
        _Helper.validateSameRange(this, v);

        double[] result = new double[v.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = this.get(i) - v.get(i);
        }

        return new DoubleArrayVector(result);
    }

    /**
     * increase the values of the cells in this vector by the values in the
     * corresponding cells of {@code v}
     *
     * @param v
     */
    default void incrementBy(Vector v) {
        _Helper.validateSameRange(this, v);

        for (int i = 0; i < length(); i++) {
            incrementBy(i, v.get(i));
        }
    }
    
    /**
     * copy the values of {@code v} to this vector
     *
     * @param v
     */
    default void copyFrom(Vector v) {

        _Helper.validateSameRange(this, v);

        for (int i = 0; i < length(); i++) {
            put(i, v.get(i));
        }

    }

    /**
     * divide each of the values in this vector by {@code n}
     *
     * @param n
     */
    default void divideBy(double n) {
        for (int i = 0; i < length(); i++) {
            divideBy(i, n);
        }
    }

    /**
     * increment the value in the {@code i}'th cell by the value of {@code v}
     *
     * @param i
     * @param v
     */
    default void incrementBy(int i, double v) {
        put(i, get(i) + v);
    }

    /**
     * divide the value on index {@code i} by {@code v}
     *
     * @param i
     * @param v
     */
    default void divideBy(int i, double v) {
        put(i, get(i) / v);
    }

    /**
     * sets all the cells in this vector to 0
     */
    default void clear() {
        for (int i = 0; i < length(); i++) {
            put(i, 0);
        }
    }

    default DoubleStream stream() {
        return IntStream
                .range(0, length())
                .mapToDouble(this::get);
    }

    static class _Helper {

        private static void validateSameRange(Vector v1, Vector v2) {
            if (v1.length() != v2.length()) {
                throw new UnsupportedOperationException("both vectors should be of the same length (" + v1.length() + " != " + v2.length() + ")");
            }
        }
    }
}
