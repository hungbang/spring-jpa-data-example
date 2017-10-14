package com.smartdev.model;

/**
 * Created by KAI on 10/14/17.
 */
public class BookRequestParam {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public BookRequestParam setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BookRequestParam setName(String name) {
        this.name = name;
        return this;
    }
}
