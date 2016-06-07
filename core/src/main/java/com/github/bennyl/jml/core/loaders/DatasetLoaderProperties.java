/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.loaders;

import com.github.bennyl.jml.core.Dataset;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author bennyl
 */
public class DatasetLoaderProperties {

    private Dataset dataset;
    private SpecificDatasetLoader loader;

    /*package*/ void initialize(Dataset dataset, SpecificDatasetLoader loader) {
        this.dataset = dataset;
        this.loader = loader;
    }

    public Dataset loadFrom(InputStream inputStream) throws IOException {
        return loader.load(this, dataset, inputStream);
    }

    public Dataset loadFrom(File file) throws IOException {
        try (FileInputStream fis = new FileInputStream(file)) {
            return loadFrom(fis);
        }
    }
}
