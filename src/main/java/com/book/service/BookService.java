package com.book.service;

import java.util.Scanner;

/**
 * @author 黄嘉浩
 * @date 2024-02-11 10:55
 **/
public class BookService {

    public static final String STRING2 = "2";
    public static final String STRING1 = "1";

    public static void bookUserServiceModule() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("**********欢迎使用图书管理系统**********");
            System.out.println("***************账户登录***************");
            System.out.println("提示：【1】已有账号，请登录 [2]没有账号，请注册");

            System.out.print("请选择方式：");
            String manner = scanner.next();
            if (!manner.equals(STRING1)&&!manner.equals(STRING2)) {
                System.out.println("选择错误!");
                continue;
            }
            System.out.print("账号：");
            String username = scanner.next();
            System.out.print("密码：");
            String password = scanner.next();

           switch (manner){
               case STRING1: // 已有账户请登录
                   if (BookUserService.login(username, password)) {
                       return;
                   }
                   break;
               case STRING2: // 没有账号,请注册
                    BookUserService.registered(username, password);
                   break;
               default:
                   System.out.println("选择错误");
           }
        }
    }
}
