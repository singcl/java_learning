package com.learning;

//多态存在的三个必要条件
//        继承
//        重写
//        父类引用指向子类对象

//当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法。
//多态的好处：可以使程序有良好的扩展，并可以对所有类的对象进行通用处理。
public class Polymorphic {
    public static void main(String[] args) {
        show(new Cat3()); // 以 Cat 对象调用 show 方法
        show(new Dog3()); // 以 Dog 对象调用 show 方法

        Animal3 a = new Cat3(); // 向上转型
        a.eat();               // 调用的是 Cat 的 eat
        Cat3 c = (Cat3)a;// 向下转型
        c.work();
    }

    public static void show(Animal3 a) {
        a.eat();
        // 类型判断
        if (a instanceof Cat3)  {
            // 猫做的事情
            Cat3 c = (Cat3)a;
            c.work();
        } else if (a instanceof Dog3) {
            // 狗做的事情
            Dog3 c = (Dog3)a;
            c.work();
        }
    }
}

abstract class Animal3 {
    abstract void eat();
}

class Cat3 extends Animal3 {
    public void eat() {
        System.out.println("吃魚");
    }

    public void  work() {
        System.out.println("抓老鼠");
    }
}

class Dog3 extends Animal3 {
    public void eat() {
        System.out.println("吃骨頭");
    }

    public void work() {
        System.out.println("看家");
    }
}