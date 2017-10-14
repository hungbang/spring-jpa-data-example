package com.smartdev.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by KAI on 10/10/17.
 */
@Entity
@Table(name = "author")
public class Author {

    private Long id;
    private String name;
    private String address;
    private List<Book> books;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    public Long getId() {
        return id;
    }

    public Author setId(Long id) {
        this.id = id;
        return this;
    }


    public String getName() {
        return name;
    }

    public Author setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Author setAddress(String address) {
        this.address = address;
        return this;
    }

    @ManyToMany(mappedBy = "authors")
    public List<Book> getBooks() {
        return books;
    }

    public Author setBooks(List<Book> books) {
        this.books = books;
        return this;
    }
}
