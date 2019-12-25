package com.learning.doc;

import java.io.*;

//下面是一个使用说明注释的简单实例。注意每一个注释都在它描述的项目的前面。
//在经过 javadoc 处理之后，SquareNum 类的注释将在 SquareNum.html 中找到。

/**
 * 演示文档注释
 *
 * @author singcl
 * @version 0.0.1
 */
public class SquareNum {
    /**
     * This method returns the square of num.
     * This is a multiline description. You can use
     * as many lines as you like.
     *
     * @param num he value to be squared.
     * @return num squared
     */
    public double square(double num) {
        return num * num;
    }

    /**
     * This method inputs a number from the user.
     *
     * @return he value input as a double.
     * @throws IOException On input error.
     * @see IOException
     */
    public double getNumber() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(isr);
        String str;
        str = inData.readLine();
        return (new Double(str)).doubleValue();
    }

    /**
     * This method demonstrates square().
     *
     * @param args Unused.
     * @return Nothing.
     * @throws IOException On input error.
     * @see IOException
     */
    public static void main(String args[]) throws IOException {
        SquareNum ob = new SquareNum();
        double val;
        System.out.println("Enter value to be squared: ");
        val = ob.getNumber();
        val = ob.square(val);
        System.out.println("Squared value is " + val);
    }
}
