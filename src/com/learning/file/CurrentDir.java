package com.learning.file;

public class CurrentDir {
    public static  void  main(String[] args) {
        String curDir = System.getProperty("user.dir");
        System.out.println("您的当前工作目录为：" + curDir);
    }
}
