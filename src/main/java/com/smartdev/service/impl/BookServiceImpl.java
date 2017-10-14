package com.smartdev.service.impl;

import com.smartdev.entity.Book;
import com.smartdev.service.BookService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by KAI on 10/12/17.
 */

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Override
    public Book getBook() {
        return null;
    }

    @Override
    public Book saveBook(Book book) {
        return null;
    }
}
