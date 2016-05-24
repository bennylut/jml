/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core;

import static com.github.bennyl.jml.utils.LangUtil.cast;

/**
 *
 * @author bennyl
 */
public abstract class LearnerParams<M extends Model> {

    protected Learner<?, M> learner;
    protected Dataset dataset;

    /*package*/ void setLearner(Learner<?, M> learner) {
        this.learner = learner;
    }

    /*package*/ void setDataset(Dataset dataset) {
        this.dataset = dataset;
    }

    protected String validate() {
        return null;
    }

    public final M start() {
        String validationError = validate();
        if (validationError == null) {
            return learner.learn(cast(this), dataset);
        } else {
            throw new InvalidParametersException(validationError);
        }
    }

}
