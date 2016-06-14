/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ds;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.HyperCube;
import com.github.bennyl.jml.core.Table;
import com.github.bennyl.jml.core.Vector;
import com.github.bennyl.jml.core.impl.ctx.CoreChildContext;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author bennyl
 */
public class SimpleDataset extends CoreChildContext implements Dataset {

    private CoreDatasetModule module;
    private Dataset internalRepresentation;

    public SimpleDataset(int... shape) {
        this.module = new CoreDatasetModule(this);

        switch (shape.length) {
            case 0:
                throw new UnsupportedOperationException("does not support 0 size shape");
            case 1:
                internalRepresentation = new DoubleArrayVector(this, shape[0]);
                break;
            case 2:
                ArrayList<Vector> table = new ArrayList<>(shape[1]);
                for (int i = 0; i < shape[1]; i++) {
                    table.add(new DoubleArrayVector(this, shape[0]));
                }
                internalRepresentation = new ColumnBasedTable(table, this);
                break;
            default:
                throw new UnsupportedOperationException("not supported yet");
        }

        initializeContext(module);
    }

    /**
     * this is NOT a copy constructor
     *
     * @param internalRepresentation
     */
    public SimpleDataset(Dataset internalRepresentation) {
        this.module = new CoreDatasetModule(this);
        this.internalRepresentation = internalRepresentation;
        initializeContext(module);
    }

//    @Override
//    public void save(OutputStream out) throws IOException {
//        SerializationService ser = getInstanceOf(SerializationService.class);
//        ser.serializeObject(new Object[]{storage, module.getDatasetScope()}, out);
//    }
//
//    public static SimpleDataset load(InputStream from) {
//        SerializationService ser = CoreContext.instance().getInstanceOf(SerializationService.class);
//        Object[] parts = ser.deserializeObject(from);
//        SimpleDataset dataset = new SimpleDataset();
//        dataset.storage = (DoubleStorage) parts[0];
//        dataset.module = new CoreDatasetModule(dataset, (SimpleScope) parts[1]);
//        dataset.initializeContext(dataset.module);
//        return dataset;
//    }
    @Override
    public Vector asVector() {
        return internalRepresentation.asVector();
    }

    @Override
    public Table asTable() {
        return internalRepresentation.asTable();
    }

    @Override
    public HyperCube asHyperCube() {
        return internalRepresentation.asHyperCube();
    }

    @Override
    public Dataset parent() {
        return this;
    }

    @Override
    public void print(PrintStream out) {
        internalRepresentation.print(out);
    }

}
