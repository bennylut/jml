/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.bennyl.jml.utils;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Random;

/**
 *
 * @author bennyl
 */
public class MathUtil {

    public static IntCollection chooseFromRange(int startInclusive, int endExclusive, int elementsToChoose, Random random) {
        int rangeSize = endExclusive - startInclusive;
        if (elementsToChoose > 0.5 * rangeSize) {
            IntList all = new IntArrayList(rangeSize);
            for (int i = startInclusive; i < endExclusive; i++) {
                all.add(i);
            }

            IntLists.shuffle(all, random);
            return all.subList(0, elementsToChoose);
        } else {
            IntSet result = new IntOpenHashSet();
            while (result.size() < elementsToChoose) {
                result.add(random.nextInt(rangeSize) + startInclusive);
            }
            return result;
        }

    }

}
