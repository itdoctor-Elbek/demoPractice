package com.example.demoPractice.model.entity;

import com.example.demoPractice.model.enums.Status;
import jakarta.persistence.*;
import lombok.*;

import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "tb_restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name="createdDate")
    LocalDateTime createdDate;
    @Column(name="updatedDate")
    LocalDateTime updatedDate;

    Status status;
    String name;

}
