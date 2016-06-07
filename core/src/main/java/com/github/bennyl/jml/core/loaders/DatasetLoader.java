/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.loaders;

import com.github.bennyl.jml.core.Context;
import com.github.bennyl.jml.core.Dataset;
import com.github.bennyl.jml.core.impl.ctx.CoreContext;
import com.google.common.reflect.TypeToken;

/**
 *
 * @author bennyl
 */
public class DatasetLoader {

    public static <P extends DatasetLoaderProperties, S extends SpecificDatasetLoader<P>> P of(Dataset dataset, Class<S> loaderType) {
        TypeToken loaderTypeToken = TypeToken.of(loaderType);
        TypeToken parametersType = loaderTypeToken.resolveType(SpecificDatasetLoader.class.getTypeParameters()[0]);

        Context context = dataset;
        
        if (dataset == null) {
            context = CoreContext.instance();
        }
        
        SpecificDatasetLoader loader = context.getInstanceOf(loaderType);
        P props = (P) context.getInstanceOf(parametersType.getRawType());
        props.initialize(dataset, loader);
        return props;
    }

    public static <P extends DatasetLoaderProperties, S extends SpecificDatasetLoader<P>> P of(Class<S> loaderType) {
        return of(null, loaderType);
    }
}
