/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.services;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.Vector;
import com.github.bennyl.jml.core.VectorValueType;
import com.github.bennyl.jml.core.impl.ds.DoubleArrayVector;
import com.github.bennyl.jml.core.impl.ds.NominalArrayVector;
import javax.inject.Inject;

/**
 *
 * @author bennyl
 */
public class SimpleVectorBuilder implements VectorBuilder {

    private Vector building;

    @Inject
    public SimpleVectorBuilder(Dataset dataset) {
        building = new DoubleArrayVector(dataset);
    }

    @Override
    public Vector toVector() {
        return building;
    }

    @Override
    public void append(double v) {
        switch (building.type()) {
            case NUMMERIC_INT:
                upgradeIntToDouble();
                break;
            case NUMMERIC_LONG:
                upgradeLongToDouble();
                break;
            case NOMINAL:
                appendNominal(v);
                return;
        }

        building.append(v);
    }

    @Override
    public void appendInt(int v) {
        switch (building.type()) {
            case NOMINAL:
                appendNominal(v);
                break;
            default:
                building.appendInt(v);
                break;
        }
    }

    @Override
    public void appendLong(long v) {
        switch (building.type()) {
            case NOMINAL:
                appendNominal(v);
                break;
            case NUMMERIC_INT:
                upgradeIntToLong();
                break;
        }

        building.appendLong(v);
    }

    @Override
    public void appendNominal(Object v) {
        if (building.type() != VectorValueType.NOMINAL) {
            upgradeToNominal();
        }

        building.appendNominal(v);
    }

    @Override
    public VectorValueType currentType() {
        return building.type();
    }

    private void upgradeIntToDouble() {
        //do nothing currently
    }

    private void upgradeLongToDouble() {
        //do nothing currently
    }

    private void upgradeIntToLong() {
        //do nothing currently
    }

    private void upgradeToNominal() {
        NominalArrayVector newVec = new NominalArrayVector(building.parent());
        building.values().forEach(newVec::appendNominal);
        building = newVec;
    }

}
