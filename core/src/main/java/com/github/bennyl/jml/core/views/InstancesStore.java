/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.views;

import com.github.bennyl.jml.core.impl.ds.PerDataset;
import com.github.bennyl.jml.core.impl.views.GenericInstanceStore;
import com.google.inject.ImplementedBy;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author bennyl
 */
@ImplementedBy(GenericInstanceStore.class)
public interface InstancesStore extends Iterable<Vector> {

    Vector instance(int i);

    double value(int i, int j);

    int numInstances();

    int numFeatures();

    Object id(int i);

    void id(int i, Object id);

    @Override
    default Iterator<Vector> iterator() {
        return instancesStream().iterator();
    }

    default Stream<Vector> instancesStream() {
        return IntStream.range(0, numInstances())
                .mapToObj(this::instance);
    }
}
