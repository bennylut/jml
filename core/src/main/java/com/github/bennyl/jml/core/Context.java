/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core;

import com.google.inject.Injector;
import com.google.inject.Provider;

/**
 *
 * @author bennyl
 */
public interface Context {

    Context parent();

    default Injector injector() {
        return parent().injector();
    }

    default <T> T getInstanceOf(Class<T> cls) {
        return injector().getInstance(cls);
    }

    default <T> Provider<T> getProviderOf(Class<T> cls) {
        return injector().getProvider(cls);
    }
}
