/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core;

import com.google.common.reflect.TypeToken;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 *
 * @author bennyl
 */
public interface Dataset extends Context {

    @Override
    Dataset parent();

    default <P extends LearnerParams<M>, M extends Model, L extends Learner<P, M>> P learn(Class<L> learnerType) {
        TypeToken learnerTypeToken = TypeToken.of(learnerType);
        TypeToken parametersType = learnerTypeToken.resolveType(Learner.class.getTypeParameters()[0]);

        L learner = getInstanceOf(learnerType);
        P params = (P) getInstanceOf(parametersType.getRawType());

        params.setLearner(learner);
        params.setDataset(this);
        return params;
    }

    Vector asVector();

    Table asTable();

    HyperCube asHyperCube();

    void print(PrintStream out);

    default void print() {
        print(System.out);
    }

    default void println() {
        print();
        System.out.println();
    }

//    void save(OutputStream out) throws IOException;
//
//    default void save(File file) throws IOException {
//        try (FileOutputStream fos = new FileOutputStream(file)) {
//            save(fos);
//        }
//    }
}
