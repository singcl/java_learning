package com.learning.mysql;

import java.sql.*;

/**
 * java 如何连接Mysql数据库
 * 1. 启动数据库 sudo service mysql start;
 * 2. 创建数据库-> 创建表 -> 插入数据：
 *  shell:
 *      1) sudo mysql -u singcl -p;
 *      2) CREATE DATABASE RUNOOB;
 *      3) CREATE TABLE `websites` (
 *          `id` int(11) NOT NULL AUTO_INCREMENT,
 *          `name` char(20) NOT NULL DEFAULT '' COMMENT '站点名称',
 *          `url` varchar(255) NOT NULL DEFAULT '',
 *          `alexa` int(11) NOT NULL DEFAULT '0' COMMENT 'Alexa 排名',
 *          `country` char(10) NOT NULL DEFAULT '' COMMENT '国家',
 *          PRIMARY KEY (`id`)
 *          ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
 *       4) INSERT INTO `websites` VALUES ('1', 'Google', 'https://www.google.cm/', '1', 'USA'), ('2', '淘宝', 'https://www.taobao.com/', '13', 'CN'), ('3', '菜鸟教程', 'http://www.runoob.com', '5892', ''), ('4', '微博', 'http://weibo.com/', '20', 'CN'), ('5', 'Facebook', 'https://www.facebook.com/', '3', 'USA');
 *
 * @author singcl
 * @version 0.0.1
 * @see MysqlDemo 'Java MySQL 连接: https://www.runoob.com/java/java-mysql-connect.html'
 * @see MysqlDemo 'MySQL 教程 https://www.runoob.com/mysql/mysql-tutorial.html'
 */
public class MysqlDemo {
    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB";

    // MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
    //static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    //static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&serverTimezone=UTC";

    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "singcl";
    static final String PASS = "singcl";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 注册 JDBC 驱动
            Class.forName(JDBC_DRIVER);

            // 打开链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, name, url FROM websites";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while (rs.next()) {
                // 通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // 处理 JDBC 错误
            se.printStackTrace();
        } catch (Exception e) {
            // 处理 Class.forName 错误
            e.printStackTrace();
        } finally {
            // 关闭资源
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }// 什么都不做
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
