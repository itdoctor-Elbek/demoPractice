package com.example.demoPractice.repository;

import com.example.demoPractice.model.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookRepository extends JpaRepository<Book, Long > {
}
