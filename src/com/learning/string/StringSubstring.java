package com.learning.string;

public class StringSubstring {
    public  static void main(String[] args) {
        String str = "my name is singcl";
        System.out.println(removeCharAt(str, 4));
    }
    public static  String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
