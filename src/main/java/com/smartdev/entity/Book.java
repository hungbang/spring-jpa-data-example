package com.smartdev.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by KAI on 10/10/17.
 */
@Entity
@Table(name = "book")
public class Book {

    private Long id;
    private String name;
    private List<Author> authors;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public Book setId(Long id) {
        this.id = id;
        return this;
    }


    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    @ManyToMany
    @JoinTable(name = "book_author",
            joinColumns = {
            @JoinColumn(name = "fk_book")
            },
            inverseJoinColumns = {
            @JoinColumn(name = "fk_author")
            }
    )
    public List<Author> getAuthors() {
        return authors;
    }

    public Book setAuthors(List<Author> authors) {
        this.authors = authors;
        return this;
    }
}
