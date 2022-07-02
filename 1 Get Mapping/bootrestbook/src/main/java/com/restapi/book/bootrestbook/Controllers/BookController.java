package com.restapi.book.bootrestbook.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.book.bootrestbook.entities.Book;
import com.restapi.book.bootrestbook.services.BookService;

@RestController
public class BookController {

    // @RequestMapping(value = "/books", method = RequestMethod.GET)

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks() 
    {
        // Book book = new Book();
        // book.setId(12345);
        // book.setTitle("Java Complete Crash");
        // book.setAuthour("KirA");
        return this.bookService.getAllBooks();
    }
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id)
    {
        return bookService.getBookbyId(id);
    }
}
