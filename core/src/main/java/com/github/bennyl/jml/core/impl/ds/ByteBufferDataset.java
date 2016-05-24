/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ds;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.impl.ctx.CoreContext;
import com.github.bennyl.jml.core.impl.ctx.CoreChildContext;
import com.github.bennyl.jml.core.services.SerializationService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/**
 *
 * @author bennyl
 */
public class ByteBufferDataset extends CoreChildContext implements Dataset {

    private int[] shape;
    private int size;
    private ByteBuffer matrix;

    private ByteBufferDataset() {

    }

    public ByteBufferDataset(int... shape) {
        super(new CoreDatasetModule());

        this.shape = shape;

        if (shape.length == 0) {
            throw new IllegalArgumentException("at least one dimention should be provided");
        }
        size = 1;
        for (int i = 0; i < shape.length; i++) {
            size *= shape[i];
        }

        if (size == 0) {
            throw new IllegalArgumentException("no dimention is allowed to be zero");
        }

        matrix = ByteBuffer.allocateDirect(size * 8);
    }

    @Override
    public void put(int index, double value) {
        if (index < 0 || index > shape[0]) {
            throw new IllegalArgumentException("index: '" + index + "' not in range [0," + shape[0] + "]");
        }

        unsafePut(index, value);
    }

    public void unsafePut(int index, double value) {
        matrix.putDouble(index * 8, value);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void save(OutputStream out) throws IOException {
        SerializationService serializationService = getInstanceOf(SerializationService.class);
        serializationService.serializeObject(new Object[]{shape, size, matrix}, out);
    }

    public static ByteBufferDataset load(InputStream from) {
        SerializationService serService = CoreContext.getInstance().getInstanceOf(SerializationService.class);
        Object[] data = serService.deserializeObject(from);
        ByteBufferDataset dataset = new ByteBufferDataset();
        dataset.shape = (int[]) data[0];
        dataset.size = (int) data[1];
        dataset.matrix = (ByteBuffer) data[2];
        return dataset;
    }

    public static ByteBufferDataset load(File from) throws IOException {
        try (FileInputStream fin = new FileInputStream(from)) {
            return load(fin);
        }
    }

    @Override
    public double get(int i) {
        if (i < 0 || i > shape[0]) {
            throw new IndexOutOfBoundsException("index: " + i + " need to be in range: [0," + shape[0] + "]");
        }

        if (shape.length > 1) {
            throw new IllegalArgumentException("dataset has more than one dimentions");
        }

        return unsafeGet(i);
    }

    public double unsafeGet(int i) {
        return this.matrix.getDouble(i * 8);
    }

    public double unsafeGet(int i, int j) {
        return this.matrix.getDouble(i * 8 * shape[0] + j * 8);
    }

    public double unsafeGet(int... idx) {
        int pos = 0;

        for (int i = 0; i < idx.length; i++) {
            pos += shape[i] * idx[i] * 8;
        }

        return this.matrix.getDouble(pos);
    }

    @Override
    public double get(int i, int j) {
        if (shape.length != 2) {
            throw new IllegalArgumentException("incorrect number of dimentions, expected: 2, has: " + shape.length);
        }

        if (i < 0 || i > shape[0]) {
            throw new IndexOutOfBoundsException("index: " + i + " need to be in range: [0," + shape[0] + "]");
        }

        if (j < 0 || j > shape[1]) {
            throw new IndexOutOfBoundsException("index: " + i + " need to be in range: [0," + shape[0] + "]");
        }

        return unsafeGet(i, j);

    }

    @Override
    public double get(int... idx) {
        int pos = 0;

        if (shape.length != idx.length) {
            throw new IllegalArgumentException("incorrect number of dimentions, expected: " + idx.length + ", has: " + shape.length);
        }

        for (int i = 0; i < idx.length; i++) {
            if (idx[i] < 0 || idx[i] > shape[i]) {
                throw new IndexOutOfBoundsException("index: " + i + " need to be in range: [0," + shape[i] + "]");
            }

            pos += shape[i] * idx[i] * 8;
        }

        return this.matrix.getDouble(pos);
    }

    @Override
    public int[] shape() {
        return shape;
    }

}
