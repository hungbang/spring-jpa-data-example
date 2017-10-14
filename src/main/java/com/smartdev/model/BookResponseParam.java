package com.smartdev.model;

/**
 * Created by KAI on 10/14/17.
 */
public class BookResponseParam {
    private String id;
    private String name;
    private String authorName;

    public String getId() {
        return id;
    }

    public BookResponseParam setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BookResponseParam setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthorName() {
        return authorName;
    }

    public BookResponseParam setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    public static final class BookResponseParamBuilder {
        private String id;
        private String name;
        private String authorName;

        private BookResponseParamBuilder() {
        }

        public static BookResponseParamBuilder aBookResponseParam() {
            return new BookResponseParamBuilder();
        }

        public BookResponseParamBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public BookResponseParamBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public BookResponseParamBuilder withAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public BookResponseParam build() {
            BookResponseParam bookResponseParam = new BookResponseParam();
            bookResponseParam.setId(id);
            bookResponseParam.setName(name);
            bookResponseParam.setAuthorName(authorName);
            return bookResponseParam;
        }
    }
}
