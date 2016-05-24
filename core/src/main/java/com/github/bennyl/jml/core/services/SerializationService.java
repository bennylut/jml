/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.core.services;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.github.bennyl.jml.utils.ConcUtil;
import java.io.InputStream;
import java.io.OutputStream;
import javax.inject.Singleton;
import org.objenesis.strategy.StdInstantiatorStrategy;

/**
 *
 * @author bennyl
 */
@Singleton
public class SerializationService {

    private ThreadLocal<Kryo> kryoRef = ConcUtil.createThreadLocal(() -> {
        Kryo k = new Kryo();
        k.setAsmEnabled(true);
        k.setInstantiatorStrategy(new StdInstantiatorStrategy());
        k.setRegistrationRequired(false);
        return k;
    });

    public void serializeObject(Object o, OutputStream onto) {
        Kryo kryo = kryoRef.get();
        try (Output output = new Output(onto)) {
            kryo.writeClassAndObject(output, o);
        }
    }

    public <T> T deserializeObject(InputStream from) {
        Kryo kryo = kryoRef.get();
        try (Input input = new Input(from)) {
            return (T) kryo.readClassAndObject(input);
        }

    }
}
