// https://blog.csdn.net/chengqiuming/article/details/91352913
/*匿名内部类适合创建那种只需要一次使用的类，定义匿名内部类的语法格式如下：

new 父类构造器（实参列表) | 实现接口()
{
    // 匿名内部类的类体部分
}
从上面的定义可以看出，匿名内部类必须继承一个父类，或实现一个接口，但最多只能继承一个父类，或实现一个接口。
两条规则:

匿名内部类不能是抽象类。
匿名内部类不能定义构造器。由于匿名内部类没有类名，所以无法定义构造器，但匿名内部类可以初始化块，可以通过初始化块来完成构造器需要完成的工作。*/
package com.learning;

import com.sun.istack.internal.NotNull;

interface Product {
    public double getPrice();
    public String getName();
}

public class AnonymousTest {
    public void test(Product p) {
        System.out.println("购买了一个" + p.getName() + "，花掉了" + p.getPrice());
    }
    public static void main(String[] args) {
        AnonymousTest ta = new AnonymousTest();

        // 调用test()方法时，需要传入一个Product参数，
        // 此处传入其匿名内部类的实例
        ta.test(new Product() {
            @Override
            public double getPrice() {
                return 566.6;
            }

            @Override
            public String getName() {
                return "华为笔记本";
            }
        });
    }
}
