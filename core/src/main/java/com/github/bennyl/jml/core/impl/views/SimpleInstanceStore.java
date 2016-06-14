/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.views;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.Table;
import com.github.bennyl.jml.core.Vector;
import com.github.bennyl.jml.core.impl.ds.PerDataset;
import com.github.bennyl.jml.core.views.InstancesStore;
import javax.inject.Inject;
import com.github.bennyl.jml.core.views.TableMetadata;

/**
 *
 * @author bennyl
 */
@PerDataset //TODO: I dont really need to have only one... am I?
public class SimpleInstanceStore implements InstancesStore {

    private Table dataset;
    private final TableMetadata meta;

    @Inject
    public SimpleInstanceStore(Dataset dataset, TableMetadata metadata) {
        this.dataset = dataset.asTable();
        this.meta = metadata;
    }

    @Override
    public Vector instance(int i) {
        return dataset.row(i);
    }

    @Override
    public double value(int i, int j) {
        return dataset.getDouble(i, j);
    }

    @Override
    public Object metadata(int i) {
        return meta.getRowMetadata(i);
    }

    @Override
    public int numInstances() {
        return dataset.numRows();
    }

    @Override
    public int numFeatures() {
        return dataset.numCols();
    }

    @Override
    public void metadata(int i, Object id) {
        meta.setRowMetadata(i, id);
    }

}
