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
public interface SpecificDatasetLoader {

    default Dataset load(InputStream input) throws IOException {
        throw new UnsupportedOperationException("loading from input stream is not supported for this loader type");
    }

    default Dataset load(File input) throws IOException {
        if (input.isDirectory()) {
            throw new UnsupportedOperationException("loading from directory is not supported for this loader type");
        }

        try (FileInputStream fis = new FileInputStream(input)) {
            return load(fis);
        }
    }
}
