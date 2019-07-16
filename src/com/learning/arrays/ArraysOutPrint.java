package com.learning.arrays;

public class ArraysOutPrint {
    public static void main(String[] args) {
        String[] singcl = new String[3];
        singcl[0] = "我";
        singcl[1] = "爱";
        singcl[2] = "你";

        for (String str : singcl) {
            System.out.print(str);
        }

        System.out.println("\n");

        for (int i = 0; i< singcl.length; i++) {
            System.out.print(singcl[i]);
        }
    }
}
