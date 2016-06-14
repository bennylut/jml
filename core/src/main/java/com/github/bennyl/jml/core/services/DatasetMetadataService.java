/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.services;

import com.github.bennyl.jml.core.impl.ds.PerDataset;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bennyl
 */
@PerDataset
public class DatasetMetadataService {

    private Map<MetaKey, Object> metadata = new HashMap<>();

    public <T> T fetch(MetaKey<T> key) {
        return (T) metadata.get(key);
    }

    public <T> void store(MetaKey<T> key, T data) {
        metadata.put(key, data);
    }

    public static interface MetaKey<T> {

    }

}
