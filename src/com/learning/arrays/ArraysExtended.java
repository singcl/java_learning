package com.learning.arrays;

import java.util.Arrays;

public class ArraysExtended {
    public static void main(String[] args) {
        String[] names = new String[] {"S", "G", "L"};
        String[] extended = new String[6];

        System.arraycopy(names, 0, extended, 0, names.length);
        Arrays.fill(extended,names.length, extended.length,"X");

        for(String val: extended) {
            System.out.println(val);
        }
    }
}
