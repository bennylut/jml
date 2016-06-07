/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.loaders;

import com.github.bennyl.jml.core.Dataset;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author bennyl
 */
public interface SpecificDatasetLoader<P extends DatasetLoaderProperties> {

    Dataset load(P properties, Dataset dataset, InputStream input) throws IOException;
}
