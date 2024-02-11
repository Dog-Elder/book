package com.book.test;

import com.book.service.BookService;

/**
 * 图书管理系统
 *
 * @author 黄嘉浩
 * @date 2024-02-10 15:12
 **/
public class BookManagement {
    public static void main(String[] args) {
        BookService.bookUserServiceModule();
        System.out.println("进入图书管理系统" );
    }

}
