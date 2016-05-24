/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.utils;

import java.util.function.Supplier;

/**
 *
 * @author bennyl
 */
public class ConcUtil {

    public static <T> ThreadLocal<T> createThreadLocal(Supplier<T> initializer) {
        return new ThreadLocal<T>() {
            @Override
            protected T initialValue() {
                return initializer.get();
            }

        };
    }
}
