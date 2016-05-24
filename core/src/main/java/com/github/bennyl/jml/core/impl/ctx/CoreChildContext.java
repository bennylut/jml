/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ctx;

import com.github.bennyl.jml.core.Context;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 *
 * @author bennyl
 */
public class CoreChildContext implements Context {

    private final Injector injector;

    public CoreChildContext(Module... modules) {
        this.injector = CoreContext.getInstance().createChildInjector(modules);
    }

    @Override
    public <T> T getInstanceOf(Class<T> cls) {
        return injector.getInstance(cls);
    }
    
}
