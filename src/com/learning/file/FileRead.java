package com.learning.file;

import java.io.*;

/**
 * 以下实例演示了使用 readLine() 方法来读取文件 test.log 内容，其中 test.log 文件内容为：
 */
public class FileRead {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("runoob.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            //
        }
    }
}
