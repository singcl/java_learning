package com.learning.arrays;

import java.util.ArrayList;

public class ArraysDel {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        objArray.clear();
        objArray.add(0, "第0个元素");
        objArray.add(1,"第 1 个元素");
        objArray.add(2,"第 2 个元素");
        System.out.println("数组删除前：" + objArray);
        objArray.remove(1);
        objArray.remove("第0个元素");
        System.out.println("数组删除后：" + objArray);
    }
}
