/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.utils.count;

import java.util.Iterator;

/**
 *
 * @author bennyl
 */
public class BoundedCounter implements Iterable<int[]> {

    private int[] bounds;

    public BoundedCounter(int... bounds) {
        this.bounds = bounds;
    }

    @Override
    public Iterator<int[]> iterator() {
        final int last = bounds.length - 1;
        return new Iterator<int[]>() {

            private int[] result = new int[bounds.length];
            private int pos = last;

            @Override
            public boolean hasNext() {
                return pos >= 0;
            }

            @Override
            public int[] next() {

                result[pos] = (result[pos] + 1) % bounds[pos];
                if (result[pos] == 0) {
                    pos--;
                } else {
                    pos = last;
                }

                return result;
            }
        };
    }

}
