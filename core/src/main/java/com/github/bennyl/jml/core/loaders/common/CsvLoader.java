/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.loaders.common;

import com.github.bennyl.jml.core.loaders.SpecificDatasetLoader;
import com.github.bennyl.jml.core.storage.DoubleStorage;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author bennyl
 */
public class CsvLoader implements SpecificDatasetLoader {

    @Override
    public void load(InputStream in, DoubleStorage storage) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
