/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.javax.util;

import java.io.File;
import java.util.Arrays;
import static java.util.Arrays.stream;
import java.util.stream.Stream;
import static java.util.stream.Stream.concat;

/**
 *
 * @author bennyl
 */
public class FSUtil {
    public static Stream<File> scan(File location)  {
        if (!location.isDirectory()) {
            return Stream.of(location);
        }else {
            return concat(Stream.of(location), stream(location.listFiles()).flatMap(FSUtil::scan));
        }
    }
}
