package com.smartdev.service.impl;

import com.smartdev.entity.Author;
import com.smartdev.repository.AuthorRepository;
import com.smartdev.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by KAI on 10/14/17.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author getAuthorById(Long aLong) {
        return authorRepository.findOne(aLong);
    }
}
