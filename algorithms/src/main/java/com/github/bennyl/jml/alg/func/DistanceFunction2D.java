/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.alg.func;

import com.github.bennyl.jml.core.views.Vector;
import org.apache.commons.math3.util.FastMath;

/**
 *
 * @author bennyl
 */
public interface DistanceFunction2D {

    double distance(Vector v1, Vector v2);

    public static DistanceFunction2D euclidian() {
        return (v1, v2) -> {
            double dist = 0;
            for (int i = 0; i < v1.length(); i++) {
                dist += v1.get(i) - v2.get(i);
            }

            return FastMath.sqrt(dist);
        };
    }
}
