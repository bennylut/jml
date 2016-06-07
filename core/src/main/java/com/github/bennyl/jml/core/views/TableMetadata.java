/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.views;

import com.github.bennyl.jml.core.impl.views.SimpleTableMetadata;
import com.google.inject.ImplementedBy;

/**
 *
 * @author bennyl
 */
@ImplementedBy(SimpleTableMetadata.class)
public interface TableMetadata<R, C> {

    void setRowMetadata(int r, R meta);

    void setColumnMetadata(int c, C meta);

    R getRowMetadata(int r);

    C getColumnMetadata(int c);

    default boolean hasRowMetadata(int r) {
        return getRowMetadata(r) != null;
    }

    default boolean hasColumnMetadata(int c) {
        return getColumnMetadata(c) != null;
    }
}
