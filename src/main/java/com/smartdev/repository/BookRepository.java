package com.smartdev.repository;

import com.smartdev.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KAI on 10/14/17.
 */
public interface BookRepository extends JpaRepository<Book, Long>{
}
