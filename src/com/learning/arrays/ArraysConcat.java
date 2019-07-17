package com.learning.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysConcat {
    public static void main(String args[]) {
        String a[] = {"S", "I", "N"};
        String[] b = {"G", "C", "L"};

        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));

        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
