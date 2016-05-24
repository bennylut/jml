/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ctx;

import com.github.bennyl.jml.core.Context;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 *
 * @author bennyl
 */
public class CoreContext implements Context {

    private static final CoreContext INSTANCE = new CoreContext();

    private final Injector injector = Guice.createInjector(new AbstractModule() {
        @Override
        protected void configure() {
        }
    });

    private CoreContext() {
    }

    public static CoreContext getInstance() {
        return INSTANCE;
    }

    public Injector createChildInjector(Module... modules) {
        return injector.createChildInjector(modules);
    }

    @Override
    public <T> T getInstanceOf(Class<T> cls) {
        return injector.getInstance(cls);
    }

}
