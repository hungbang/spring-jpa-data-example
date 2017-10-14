package com.smartdev.controller;

import com.smartdev.builder.AuthorBuilder;
import com.smartdev.builder.BookBuilder;
import com.smartdev.entity.Author;
import com.smartdev.entity.Book;
import com.smartdev.model.BookRequestParam;
import com.smartdev.model.BookResponseParam;
import com.smartdev.service.AuthorService;
import com.smartdev.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * Created by KAI on 10/14/17.
 */

@RestController
@RequestMapping("/api/v1/books")
public class BookRestController {


    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    //request list book
    @GetMapping
    public ResponseEntity<?> getAllBook() {
        return null;
    }

    //request 1 book
    @GetMapping("/{id}")
    public void getBook(@PathVariable("id") Long id) {

    }

    //Create book
    @PostMapping
    public ResponseEntity<?> createBook(@RequestBody BookRequestParam param) {
        try {

            Author author = authorService.getAuthorById(new Long(1));
            Book book = BookBuilder.aBook().withId(param.getId())
                    .withName(param.getName()).withAuthors(Arrays.asList(author)).build();
            Book savedBook = bookService.saveBook(book);
            BookResponseParam bookResponseParam = BookResponseParam
                    .BookResponseParamBuilder
                    .aBookResponseParam()
                    .withId(String.valueOf(savedBook.getId()))
                    .withName(savedBook.getName())
                    .withAuthorName(author.getName())
                    .build();
            return ResponseEntity.status(HttpStatus.CREATED).body(bookResponseParam);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }

    }

    //remove book
    @DeleteMapping
    public void deleteBook() {

    }

}
