/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.views;

import com.github.bennyl.jml.core.impl.ds.PerDataset;
import com.github.bennyl.jml.core.services.DatasetMetadataService;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import com.github.bennyl.jml.core.views.TableMetadata;

/**
 *
 * @author bennyl
 * @deprecated replaced with {@link  DatasetMetadataService}
 */
@Deprecated
@PerDataset
public class SimpleTableMetadata<R, C> implements TableMetadata<R, C> {

    private Int2ObjectMap metamap = new Int2ObjectOpenHashMap();

    @Override
    public void setRowMetadata(int r, R meta) {
        metamap.put(r, meta);
    }

    @Override
    public void setColumnMetadata(int c, C meta) {
        metamap.put(-c, meta);
    }

    @Override
    public R getRowMetadata(int r) {
        return (R) metamap.get(r);
    }

    @Override
    public C getColumnMetadata(int c) {
        return (C) metamap.get(-c);
    }

}
