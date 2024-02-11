package com.book.entity;

/**
 * 图书管理系统用户类
 * @author 黄嘉浩
 * @date 2024-02-10 14:46
 **/
public class BookUser {
    /**
     * 账号
     **/
    private String username;
    /**
     * 密码
     **/
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BookUser() {
    }

    public BookUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
