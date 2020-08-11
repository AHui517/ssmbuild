package com.kong.controller;

import com.kong.pojo.Books;
import com.kong.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/all")
    public String allbooks(Model model){
        List<Books> books = bookService.queryAllBooks();
        System.out.println(books);
        model.addAttribute("books",books);
        return "books";
    }
}
