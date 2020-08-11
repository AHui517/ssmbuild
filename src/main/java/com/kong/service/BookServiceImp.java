package com.kong.service;

import com.kong.dao.BookMapper;
import com.kong.pojo.Books;

import java.util.List;

public class BookServiceImp implements BookService{

    private BookMapper mapper;

    public void setMapper(BookMapper mapper) {
        this.mapper = mapper;
    }

    public int addBook(Books book) {
        return mapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return mapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return mapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return mapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return mapper.queryAllBooks();
    }
}
