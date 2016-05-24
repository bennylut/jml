/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.alg.models;

import com.github.bennyl.jml.core.Model;

/**
 *
 * @author bennyl
 */
public class Clusters implements Model {

    private int[][] rowAssignment;

    public Clusters(int[][] rowAssignment) {
        this.rowAssignment = rowAssignment;
    }

    public int[][] getRowAssignment() {
        return rowAssignment;
    }

}
