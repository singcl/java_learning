package com.learning.thread;
//Java 提供了三种创建线程的方法：
//
//        通过实现 Runnable 接口；
//        通过继承 Thread 类本身；
//        通过 Callable 和 Future 创建线程。

// 最简单的方法是创建一个实现 Runnable 接口的类
public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    @Override
    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        } catch(InterruptedException e) {
            System.out.println("Thread " +  threadName + " exiting.");
        }
    }

    public void start() {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
