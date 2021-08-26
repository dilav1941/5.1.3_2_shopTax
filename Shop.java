package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Shop {
    LongAdder sum = new LongAdder ();
    static final int minValue = 3;
    static final int maxValue = 10000;

    public void taxGenerator () {
        Random random = new Random ();
        long[] tax = new long[ minValue ];
        for (int i = 0; i < tax.length; i++) {
            tax[ i ] = Math.abs (random.nextInt (maxValue));
            sum.add (tax[ i ]);
        }
        System.out.println ("Выручка магазина " + Thread.currentThread ().getName () + Arrays.toString (tax));
    }
}

