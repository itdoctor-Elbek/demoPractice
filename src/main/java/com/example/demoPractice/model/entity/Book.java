package com.example.demoPractice.model.entity;

import com.example.demoPractice.model.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "tb_book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "createdDate")
    LocalDateTime createdData;
    @Column(name = "updatedDate")
    LocalDateTime updatedData;

    @Enumerated(EnumType.STRING)
    Status status;
    @Column(name = "booking_date", columnDefinition = "Date")
    LocalDate bookingDate;

    @ManyToOne
    Room room;

}
