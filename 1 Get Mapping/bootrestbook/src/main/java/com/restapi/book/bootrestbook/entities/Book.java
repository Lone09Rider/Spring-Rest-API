package com.restapi.book.bootrestbook.entities;

public class Book {
    private int id;
    private String title;
    private String authour;

    public Book(int id, String title, String authour) {
        this.id = id;
        this.title = title;
        this.authour = authour;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthour() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    @Override
    public String toString() {
        return "book [authour=" + authour + ", id=" + id + ", title=" + title + "]";
    }
}
