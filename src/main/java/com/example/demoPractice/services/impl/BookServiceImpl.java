package com.example.demoPractice.services.impl;

import com.example.demoPractice.model.entity.Book;
import com.example.demoPractice.model.enums.Status;
import com.example.demoPractice.model.request.BookCreateRequest;
import com.example.demoPractice.repository.BookRepository;
import com.example.demoPractice.services.BookService;
import com.example.demoPractice.services.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository repository;
    @Qualifier("roomServiceImpl")
    private final RoomService service;


    @Override
    public Book save(BookCreateRequest request) {

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate bookingDate = null;


        try {
            bookingDate = LocalDate.parse(request.bookingDate(), dateFormatter);

        }catch (Exception e){
            System.err.println(e);
        }

        if (bookingDate == null){
            throw new RuntimeException("LocalDate Parsing error");
        }


        Book book = Book.builder()
                .status(Status.ACTIVE)
                .createdData(LocalDateTime.now())
                .updatedData(LocalDateTime.now())
                .bookingDate(bookingDate)
                .room(service.getById(request.roomId()))
                .build();

        return repository.save(book);
    }
}
