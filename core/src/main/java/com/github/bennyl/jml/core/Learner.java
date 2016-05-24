/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core;

/**
 *
 * @author bennyl
 */
public interface Learner<P extends LearnerParams<M>, M extends Model> {

    M learn(P params, Dataset dataset);
}
