package com.inventory.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inventory.repository.vo.BookVo;
import com.inventory.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;
    
    @GetMapping("/{bookId}")
    public String getBookDetails(@PathVariable Long bookId, Model model) {
        BookVo book = bookService.findById(bookId); // Assuming BookService retrieves the book details
        model.addAttribute("book", book);
        return "book/book"; // This maps to views/book/book.jsp
    }
    
    @GetMapping("/books")
    public String getBooks(Model model) {
        List<BookVo> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "book";
    }
}