package com.smartdev.builder;

import com.smartdev.model.BookRequestParam;

/**
 * Created by KAI on 10/14/17.
 */
public final class BookRequestParamBuilder {
    private Long id;
    private String name;

    private BookRequestParamBuilder() {
    }

    public static BookRequestParamBuilder aBookRequestParam() {
        return new BookRequestParamBuilder();
    }

    public BookRequestParamBuilder withId(Long id) {
        this.id = id;
        return this;
    }

    public BookRequestParamBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public BookRequestParam build() {
        BookRequestParam bookRequestParam = new BookRequestParam();
        bookRequestParam.setId(id);
        bookRequestParam.setName(name);
        return bookRequestParam;
    }
}
