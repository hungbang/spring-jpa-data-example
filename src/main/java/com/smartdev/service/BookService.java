package com.smartdev.service;

import com.smartdev.entity.Book;

/**
 * Created by KAI on 10/12/17.
 */
public interface BookService {
    Book getBook();

    Book saveBook(Book book);

    Book getBookById(Long id);
}
