package com.learning.string;

public class StringReverseExample {
    public static void main(String[] args) {
        String string = "singcl";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("字符串翻转后：" + reverse);
    }
}
