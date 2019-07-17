package com.learning.arrays;

import java.util.Arrays;

public class ArraysFill {
    public static final void main(String[] args) {
        int array[] = new int[6];
        Arrays.fill(array, 100);
        // for
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
        Arrays.fill(array, 3, 6 ,50);
        // foreach
        for(int x: array) {
            System.out.println(x);
        }
    }
}
