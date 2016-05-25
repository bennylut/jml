/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.views;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.impl.ds.PerDataset;
import com.github.bennyl.jml.core.views.InstancesStore;
import com.github.bennyl.jml.core.views.Vector;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import javax.inject.Inject;

/**
 *
 * @author bennyl
 */
@PerDataset
public class GenericInstanceStore implements InstancesStore {

    private Dataset dataset;
    private GenericRowVector[] vectors;
    private Int2ObjectMap idMap = new Int2ObjectOpenHashMap();

    @Inject
    public GenericInstanceStore(Dataset dataset) {
        this.dataset = dataset;
        this.vectors = new GenericRowVector[dataset.size(0)];
        for (int i = 0; i < this.vectors.length; i++) {
            vectors[i] = new GenericRowVector(dataset, i);
        }
    }

    @Override
    public Vector instance(int i) {
        return vectors[i];
    }

    @Override
    public double value(int i, int j) {
        return dataset.get(i, j);
    }

    @Override
    public Object id(int i) {
        return idMap.get(i);
    }

    @Override
    public int numInstances() {
        return dataset.size(0);
    }

    @Override
    public int numFeatures() {
        return dataset.size(1);
    }

    @Override
    public void id(int i, Object id) {
        idMap.put(i, id);
    }

}
