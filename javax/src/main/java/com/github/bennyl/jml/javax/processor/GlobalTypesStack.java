/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.javax.processor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeParameterReference;
import spoon.reflect.reference.CtTypeReference;

/**
 *
 * @author bennyl
 */
public class GlobalTypesStack {

    private List<Map<String, CtTypeReference>> stack = new LinkedList<>();
    private Factory factory;

    public GlobalTypesStack(Factory factory) {
        this.factory = factory;
    }

    public void pushNewFrame() {
        stack.add(0, new HashMap<>());
    }

    public void popTopFrame() {
        stack.remove(0);
    }

    public void defineGlobal(String name, String quilifiedName) {
        System.out.println("define global: " + name + " = " + quilifiedName);
        stack.get(0).put(name, factory.Type().createReference(quilifiedName));
    }

    public void defineGlobalTypeVariable(String name) {
        stack.get(0).put(name, factory.Type().createTypeParameterReference(name));
    }

    public void defineGlobalTypeVariables(CtTypeParameterReference... variables) {
        defineGlobalTypeVariables(Arrays.asList(variables));
    }

    public void defineGlobalTypeVariables(Iterable<CtTypeParameterReference> variables) {
        final Map<String, CtTypeReference> scope = stack.get(0);
        for (CtTypeReference v : variables) {
            scope.put(v.getSimpleName(), v);
        }
    }

    public CtTypeReference lookup(String name) {
        for (Map<String, CtTypeReference> frame : stack) {
            CtTypeReference result = frame.get(name);
            if (result != null) {
                return result;
            }
        }

        System.out.println("warning: return non global reference [" + name + "]");
        return factory.Type().createReference(name);
    }
}
