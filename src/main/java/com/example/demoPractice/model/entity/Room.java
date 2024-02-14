package com.example.demoPractice.model.entity;

import com.example.demoPractice.model.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "tb_room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "created_date")
    LocalDateTime created_date;
    @Column(name = "updated_date")
    LocalDateTime updated_date;
    Status status;


    @ManyToOne
    Restaurant restaurant;
    Integer capacity;
    String name;
    Integer price;
}
