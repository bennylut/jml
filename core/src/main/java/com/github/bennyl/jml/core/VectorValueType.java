/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core;

/**
 *
 * @author bennyl
 */
public enum VectorValueType {
    VARIED {
        @Override
        Object get(Vector v, int i) {
            VectorValueType elementType = v.type(i);
            if (elementType == VARIED) {
                throw new IllegalStateException("element type cannot be varied");
            }

            return elementType.get(v, i);
        }

        @Override
        void set(Vector v, int i, Object value) {
            VectorValueType elementType = v.type(i);
            if (elementType == VARIED) {
                throw new IllegalStateException("element type cannot be varied");
            }

            elementType.set(v, i, value);
        }

    }, NUMMERIC_DOUBLE {
        @Override
        Object get(Vector v, int i) {
            return v.getDouble(i);
        }

        @Override
        void set(Vector v, int i, Object value) {
            v.setDouble(i, ((Number) value).doubleValue());
        }

    }, NUMMERIC_INT {
        @Override
        Object get(Vector v, int i) {
            return v.getInt(i);
        }

        @Override
        void set(Vector v, int i, Object value) {
            v.setInt(i, ((Number) value).intValue());
        }

    }, NUMMERIC_LONG {
        @Override
        Object get(Vector v, int i) {
            return v.getLong(i);
        }

        @Override
        void set(Vector v, int i, Object value) {
            v.setLong(i, ((Number) value).longValue());
        }
    }, NOMINAL {
        @Override
        Object get(Vector v, int i) {
            return v.getNominal(i);
        }

        @Override
        void set(Vector v, int i, Object value) {
            v.setNominal(i, value);
        }
    };

    abstract Object get(Vector v, int i);

    abstract void set(Vector v, int i, Object value);

}
