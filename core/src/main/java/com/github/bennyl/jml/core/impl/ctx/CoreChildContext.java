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
public abstract class CoreChildContext implements Context {

    private Injector injector = null;

    protected final void initializeContext(Module... modules) {
        this.injector = CoreContext.instance().createChildInjector(modules);
    }

    @Override
    public Injector injector() {
        return injector;
    }

}
