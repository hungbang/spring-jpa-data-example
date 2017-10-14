package com.smartdev.repository;

import com.smartdev.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KAI on 10/14/17.
 */
public interface AuthorRepository extends JpaRepository<Author, Long>{
}
