/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.loaders;

import com.github.bennyl.jml.core.Context;
import com.github.bennyl.jml.core.impl.ctx.CoreContext;

/**
 *
 * @author bennyl
 */
public class DatasetLoader {

    public static <S extends SpecificDatasetLoader> S of(Class<S> loaderType) {
        Context context = CoreContext.instance();
        S loader = context.getInstanceOf(loaderType);
        return loader;
    }

}
