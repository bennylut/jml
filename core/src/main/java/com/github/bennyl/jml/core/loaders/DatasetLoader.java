/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.loaders;

import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.impl.ctx.CoreContext;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author bennyl
 */
public class DatasetLoader {

    public static Dataset load(InputStream input, Class<? extends Dataset> datasetType, Class<? extends SpecificDatasetLoader> loaderType) throws IOException {
        final CoreContext context = CoreContext.instance();
        Dataset dataset = context.getInstanceOf(datasetType);
        SpecificDatasetLoader loader = dataset.getInstanceOf(loaderType);
        loader.load(input, dataset);
        return dataset;
    }
}
