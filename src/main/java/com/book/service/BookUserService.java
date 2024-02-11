package com.book.service;

import com.book.entity.BookUser;

/**
 * 图书用户服务
 *
 * @author 黄嘉浩
 * @date 2024-02-10 14:56
 **/
public class BookUserService {
    /**
     * 用户账号密码管理
     **/
    private static final BookUser[] BOOK_USERS = new BookUser[10];

    static {
        BOOK_USERS[0] = new BookUser("xiaoli", "666666");
    }

    /**
     * 登录方法
     **/
    public static boolean login(String username, String password) {
        if (publicCheck(username, password)) {
            return false;
        }

        for (int i = 0; i < BOOK_USERS.length; i++) {
            BookUser bookUser = BOOK_USERS[i];
            if (bookUser != null
                    && bookUser.getUsername().equals(username)
                    && bookUser.getPassword().equals(password)) {
                System.out.println("登录成功!");
                return true;
            }
        }
        System.out.println("登录失败");
        return false;
    }

    /**
     * 注册
     **/
    public static boolean registered(String username, String password) {
        if (publicCheck(username, password)) {
            return false;
        }

        // 检查是否存在相同的账号
        for (int i = 0; i < BOOK_USERS.length; i++) {
            BookUser bookUser = BOOK_USERS[i];
            if (bookUser != null && bookUser.getUsername().equals(username)) {
                System.out.println("账号已存在");
                return false;
            }
        }

        // 存放在用户管理中
        for (int i = 0; i < BOOK_USERS.length; i++) {
            BookUser bookUser = BOOK_USERS[i];
            if (bookUser == null) {
                // 创建用户
                BOOK_USERS[i] = new BookUser(username, password);
                System.out.println("注册成功,重新登录");
                return true;
            }
        }
        System.out.println("人员达到上线无法进行注册");
        return false;
    }

    private static boolean publicCheck(String username, String password) {
        if (username == null || username.isBlank()) {
            System.out.println("账号不能为空或null");
            return true;
        }
        if (password == null || password.isBlank()) {
            System.out.println("密码不能为空或null");
            return true;
        }
        return false;
    }


}
