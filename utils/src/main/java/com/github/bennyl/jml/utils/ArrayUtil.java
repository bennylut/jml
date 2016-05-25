/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.utils;

import java.lang.reflect.Array;

/**
 *
 * @author bennyl
 */
public class ArrayUtil {

    public static <T> T[] prepend(T[] array, T... values) {
        T[] result = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length + values.length);
        System.arraycopy(values, 0, result, 0, values.length);
        System.arraycopy(array, 0, result, values.length, array.length);
        return result;
    }
}
