/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ds;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.impl.ctx.CoreChildContext;
import com.github.bennyl.jml.core.impl.ctx.CoreContext;
import com.github.bennyl.jml.core.impl.ctx.SimpleScope;
import com.github.bennyl.jml.core.impl.storage.DoubleArrayStorage;
import com.github.bennyl.jml.core.impl.storage.DoubleMatrixStorage;
import com.github.bennyl.jml.core.impl.storage.EmptyDoubleStorage;
import com.github.bennyl.jml.core.services.SerializationService;
import com.github.bennyl.jml.core.storage.DoubleStorage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author bennyl
 */
public class SimpleDataset extends CoreChildContext implements Dataset {

    private DoubleStorage storage;
    private CoreDatasetModule module;

    public SimpleDataset(DoubleStorage storage) {
        this.storage = storage;
        this.module = new CoreDatasetModule(this);
        initializeContext(module);
    }

    public SimpleDataset() {
        this(new EmptyDoubleStorage());
    }

    @Override
    public void save(OutputStream out) throws IOException {
        SerializationService ser = getInstanceOf(SerializationService.class);
        ser.serializeObject(new Object[]{storage, module.getDatasetScope()}, out);
    }

    public static SimpleDataset load(InputStream from) {
        SerializationService ser = CoreContext.instance().getInstanceOf(SerializationService.class);
        Object[] parts = ser.deserializeObject(from);
        SimpleDataset dataset = new SimpleDataset();
        dataset.storage = (DoubleStorage) parts[0];
        dataset.module = new CoreDatasetModule(dataset, (SimpleScope) parts[1]);
        dataset.initializeContext(dataset.module);
        return dataset;
    }

    @Override
    public void put(int index, double value) {
        storage.put(index, value);
    }

    @Override
    public void put(int i, int j, double value) {
        storage.put(i, j, value);
    }

    @Override
    public void put(int[] indexes, double value) {
        storage.put(indexes, value);
    }

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public int size(int dimension) {
        return storage.size(dimension);
    }

    @Override
    public int dimensions() {
        return storage.dimensions();
    }

    @Override
    public double get(int i) {
        return storage.get(i);
    }

    @Override
    public double get(int i, int j) {
        return storage.get(i, j);
    }

    @Override
    public double get(int... pos) {
        return storage.get(pos);
    }

    @Override
    public int[] shape() {
        return storage.shape();
    }

    @Override
    public void reshape(int... shape) {
        if (shape.length == this.shape().length) {
            this.storage.reshape(shape);
        } else if (shape.length == 1) {
            this.storage = new DoubleArrayStorage(new double[shape[0]]);
        } else if (shape.length == 2) {
            this.storage = new DoubleMatrixStorage(new double[shape[0]][shape[1]]);
        } else {
            throw new UnsupportedOperationException("not supported yet");
        }
    }

}
