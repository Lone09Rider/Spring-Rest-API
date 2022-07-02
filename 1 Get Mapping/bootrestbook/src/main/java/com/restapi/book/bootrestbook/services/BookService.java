package com.restapi.book.bootrestbook.services;
import java.util.*;

import org.springframework.stereotype.Component;

import com.restapi.book.bootrestbook.entities.Book;

@Component
public class BookService {
    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(12345, "Core Java", "KirA"));
        list.add(new Book(23345, "Core C++", "XYZ"));
        list.add(new Book(78345, "Ruby", "ABC"));
        list.add(new Book(12389, "Core Python", "BeasT"));
    }

    // Returns all books
    public List<Book> getAllBooks()
    {
        return list;
    }

    // Returns a Specific Book
    public Book getBookbyId(int id) 
    {
        Book book = null;
        book = list.stream().filter(e->e.getId() == id).findFirst().get();
        return book;
    }
}
