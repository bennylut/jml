/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.impl.ctx;

import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.Scope;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author bennyl
 */
public class SimpleScope implements Scope {

    private ConcurrentHashMap<Key, Provider> scoped = new ConcurrentHashMap<>();

    @Override
    public <T> Provider<T> scope(Key<T> key, Provider<T> unscoped) {
        return scoped.computeIfAbsent(key, k -> unscoped);
    }

}
