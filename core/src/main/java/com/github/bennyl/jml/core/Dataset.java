/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core;

import com.github.bennyl.jml.core.storage.DoubleStorage;
import com.github.bennyl.jml.utils.count.BoundedCounter;
import com.google.common.reflect.TypeToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author bennyl
 */
public interface Dataset extends Context, DoubleStorage {

    default <P extends LearnerParams<M>, M extends Model, L extends Learner<P, M>> P learn(Class<L> learnerType) {
        TypeToken learnerTypeToken = TypeToken.of(learnerType);
        TypeToken parametersType = learnerTypeToken.resolveType(Learner.class.getTypeParameters()[0]);

        L learner = getInstanceOf(learnerType);
        P params = (P) getInstanceOf(parametersType.getRawType());

        params.setLearner(learner);
        params.setDataset(this);
        return params;
    }

    /**
     * @return the sum of all the elements in this array
     */
    default double sum() {
        double sum = 0;

        switch (dimensions()) {
            case 1:
                for (int i = 0; i < size(); i++) {
                    sum += get(i);
                }
                break;
            case 2:
                for (int i = 0; i < size(0); i++) {
                    for (int j = 0; j < size(1); j++) {
                        sum += get(i, j);
                    }
                }
                break;
            default:
                BoundedCounter counter = new BoundedCounter(shape());
                for (int[] index : counter) {
                    sum += get(index);
                }
                break;
        }

        return sum;
    }

    

    void save(OutputStream out) throws IOException;

    default void save(File file) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(file)) {
            save(fos);
        }
    }


}
