package com.example.demoPractice.services;

import com.example.demoPractice.model.entity.Book;
import com.example.demoPractice.model.request.BookCreateRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public interface BookService {

    Book save(BookCreateRequest request);
}
