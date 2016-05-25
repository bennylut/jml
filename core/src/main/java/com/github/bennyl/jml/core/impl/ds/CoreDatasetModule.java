/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ds;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.impl.ctx.SimpleScope;
import com.google.inject.AbstractModule;

/**
 *
 * @author bennyl
 */
public class CoreDatasetModule extends AbstractModule {

    private Dataset dataset;
    private SimpleScope scope = new SimpleScope();

    public CoreDatasetModule(Dataset dataset) {
        this.dataset = dataset;
    }

    public CoreDatasetModule(Dataset dataset, SimpleScope datasetScope) {
        this.dataset = dataset;
        this.scope = datasetScope;
    }

    @Override
    protected void configure() {
        bindScope(PerDataset.class, scope);
        bind(Dataset.class).toInstance(dataset);
    }

    public SimpleScope getDatasetScope() {
        return scope;
    }

}
