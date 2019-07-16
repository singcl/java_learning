package com.learning.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysReserve {
    public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前排序: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("翻转后的数组：" + arrayList);
    }
}
