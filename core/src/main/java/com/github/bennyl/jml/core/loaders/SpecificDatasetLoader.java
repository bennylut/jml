/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.loaders;

import com.github.bennyl.jml.core.storage.DoubleStorage;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author bennyl
 */
public interface SpecificDatasetLoader {

    void load(InputStream in, DoubleStorage storage) throws IOException;
}
