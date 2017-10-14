package com.smartdev.builder;

import com.smartdev.entity.Author;
import com.smartdev.entity.Book;

import java.util.List;

/**
 * Created by KAI on 10/14/17.
 */
public final class BookBuilder {
    private Long id;
    private String name;
    private List<Author> authors;

    private BookBuilder() {
    }

    public static BookBuilder aBook() {
        return new BookBuilder();
    }

    public BookBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public BookBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public BookBuilder withAuthors(List<Author> authors) {
        this.authors = authors;
        return this;
    }

    public Book build() {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setAuthors(authors);
        return book;
    }
}
