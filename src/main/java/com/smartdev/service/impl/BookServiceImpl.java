package com.smartdev.service.impl;

import com.smartdev.entity.Book;
import com.smartdev.repository.BookRepository;
import com.smartdev.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by KAI on 10/12/17.
 */

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book getBook() {
        return null;
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.saveAndFlush(book);
    }
}
