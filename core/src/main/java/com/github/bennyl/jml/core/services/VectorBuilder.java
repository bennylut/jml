/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.services;

import com.github.bennyl.jml.core.Vector;
import com.github.bennyl.jml.core.VectorValueType;
import com.google.inject.ImplementedBy;

/**
 *
 * @author bennyl
 */
@ImplementedBy(SimpleVectorBuilder.class)
public interface VectorBuilder {

    Vector toVector();

    void append(double v);

    void appendInt(int v);

    void appendLong(long v);

    void appendNominal(Object v);

    VectorValueType currentType();

    default void appendParsed(String value) {
        switch (currentType()) {
            case VARIED:
                throw new UnsupportedOperationException("does not know how to build varied values vectors");
            case NUMMERIC_INT:
                try {
                    appendInt(Integer.parseInt(value));
                    break;
                } catch (NumberFormatException e) {
                    //will attempt to append nummeric_long
                }
            case NUMMERIC_LONG:
                try {
                    appendLong(Long.parseLong(value));
                    break;
                } catch (NumberFormatException e) {
                    //will attempt to append nummeric_double
                }
            case NUMMERIC_DOUBLE:
                try {
                    append(Double.parseDouble(value));
                    break;
                } catch (NumberFormatException e) {
                    //will attempt to append nominal
                }
            case NOMINAL:
                appendNominal(value);
                break;
            default:
                throw new AssertionError(currentType().name());

        }
    }
}
