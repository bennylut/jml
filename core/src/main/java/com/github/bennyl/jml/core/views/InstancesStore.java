/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.views;

import com.github.bennyl.jml.core.Vector;
import com.github.bennyl.jml.core.impl.views.SimpleInstanceStore;
import com.google.inject.ImplementedBy;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * a view of a dataset that assume the following: dataset is composed from rows,
 * each represents a single instance. each row is composed from values of
 * features
 *
 * @author bennyl
 */
@ImplementedBy(SimpleInstanceStore.class)
public interface InstancesStore extends Iterable<Vector> {

    Vector instance(int i);

    double value(int i, int j);

    int numInstances();

    int numFeatures();

    /**
     * @param i instance number
     * @return the metadata of the given instance number
     */
    Object metadata(int i);

    /**
     * sets the metadata of the given instance number
     *
     * @param i the instance number
     * @param meta the metadata to set
     */
    void metadata(int i, Object meta);

    @Override
    default Iterator<Vector> iterator() {
        return instancesStream().iterator();
    }

    default Stream<Vector> instancesStream() {
        return IntStream.range(0, numInstances())
                .mapToObj(this::instance);
    }
}
