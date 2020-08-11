package com.kong.service;

import com.kong.pojo.Books;

import java.util.List;

public interface BookService {

    //增加一本书
    int addBook(Books book);

    //    删除一本书
    int deleteBookById(int id);

    //    更新书的信息
    int updateBook(Books books);

    //    查询一本书
    Books queryBookById(int id);

    //    查询所有书
    List<Books> queryAllBooks();
}
