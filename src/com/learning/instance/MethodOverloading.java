package com.learning.instance;

/*先来看下方法重载（Overloading）的定义：
如果有两个方法的方法名相同，但参数不一致，哪么可以说一个方法是另一个方法的重载。 具体说明如下：
1. 方法名相同
2. 方法的参数类型，参数个不一样
3. 方法的返回类型可以不相同
4. 方法的修饰符可以不相同
5. main 方法也可以被重载
*/
public class MethodOverloading {
    public static void main(String[] args) {
        Info t = new Info(3);
        t.info();
        t.info("重载方法");

        //重载构造函数
        new Info();
    }
}

class Info {
    private int height;

    Info() {
        System.out.println("无参数构造函数");
        height = 4;
    }

    Info(int i) {
        System.out.println("房子高度为 " + i + " 米");
        height = i;
    }

    void info() {
        System.out.println("房子高度为 " + height + " 米");
    }

    void info(String s) {
        System.out.println(s + ": 房子高度为 " + height + " 米");
    }
}