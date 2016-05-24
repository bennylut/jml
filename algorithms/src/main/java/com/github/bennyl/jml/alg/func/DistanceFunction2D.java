/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.alg.func;

import com.github.bennyl.jml.core.Dataset;
import org.apache.commons.math3.util.FastMath;

/**
 *
 * @author bennyl
 */
public interface DistanceFunction2D {

    double distance(Dataset dataset, int row1, int row2);

    public static DistanceFunction2D euclidian() {
        return (d, r1, r2) -> {
            double dist = 0;
            for (int i = 0; i < d.size(0); i++) {
                dist += d.get(r1, i) - d.get(r2, i);
            }

            return FastMath.sqrt(dist);
        };
    }
}
