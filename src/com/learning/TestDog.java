package com.learning;

//方法的重写规则
//https://www.runoob.com/java/java-override-overload.html
class Animal {
    public void move() {
        System.out.println("動物可以移動");
    }
}

class Dog2 extends Animal{
    public void move() {
        System.out.println("狗可以跑和走");
    }
    public void  bark() {
        System.out.println("狗可以吠叫");
    }
}

public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog2();// Dog 对象
        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
//        b.bark(); // 这里执行会报错
    }
}

//该程序将抛出一个编译错误，因为b的引用类型Animal没有bark方法。
//TestDog.java:30: cannot find symbol
//        symbol  : instance bark()
//        location: class Animal
//                b.bark();
//        ^