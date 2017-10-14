package com.smartdev.builder;

import com.smartdev.entity.Author;
import com.smartdev.entity.Book;

import java.util.List;

/**
 * Created by KAI on 10/14/17.
 */
public final class AuthorBuilder {
    private Long id;
    private String name;
    private String address;
    private List<Book> books;

    private AuthorBuilder() {
    }

    public static AuthorBuilder anAuthor() {
        return new AuthorBuilder();
    }

    public AuthorBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public AuthorBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public AuthorBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public AuthorBuilder withBooks(List<Book> books) {
        this.books = books;
        return this;
    }

    public Author build() {
        Author author = new Author();
        author.setId(id);
        author.setName(name);
        author.setAddress(address);
        author.setBooks(books);
        return author;
    }
}
