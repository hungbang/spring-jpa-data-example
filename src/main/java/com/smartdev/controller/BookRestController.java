package com.smartdev.controller;

import com.smartdev.builder.AuthorBuilder;
import com.smartdev.builder.BookBuilder;
import com.smartdev.entity.Author;
import com.smartdev.entity.Book;
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
@RequestMapping("/books")
public class BookRestController {


    @Autowired
    private BookService bookService;

    //request list book
    @GetMapping
    public ResponseEntity<?> getAllBook(){
        return null;
    }

    //request 1 book
    @GetMapping("/{id}")
    public void getBook(@PathVariable("id") Long id){

    }

    //Create book
    @PostMapping
    public ResponseEntity<?> updateBook(@RequestBody Book book){
        try{
            if(book == null){
                book = createBook();
            }
            Book savedBook = bookService.saveBook(book);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }

    }

    private Book createBook() {

        Author author = AuthorBuilder.anAuthor()
                .withId(new Long(1))
                .withAddress("da nang")
                .withName("John")
                .build();
        Book book = BookBuilder.aBook()
                .withId(new Long(1))
                .withName("Programming Language")
                .withAuthors(Arrays.asList(author)).build();

        return book;
    }


    //remove book
    @DeleteMapping
    public void deleteBook(){

    }

}
