package com.learning;

public class Dog {
    String breed;
    public int age = 14;
    String color;
    String name;
//    在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。
    public Dog() {
        //
    }
    public Dog(String name) {
        this.name = name;
        System.out.println("小狗的名字是:" + name);
    }
    public void barking() {
        System.out.println("小狗正在狂叫");
    }
}
