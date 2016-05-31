/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.processors;

import com.google.auto.service.AutoService;
import java.util.Collections;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;

/**
 *
 * @author bennyl
 */
@AutoService(Processor.class)
public class JavaxCompiler extends AbstractProcessor {

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        System.out.println("ANNOTATIONS SET PROVIDED");
        return Collections.singleton("*"); //always call me!
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.out.println("IVE BEEN CALLED! WITH " + annotations.size() + " ANNOTATIONS!");
        return true;
    }

}
