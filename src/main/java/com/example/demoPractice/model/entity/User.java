package com.example.demoPractice.model.entity;

import com.example.demoPractice.model.enums.Status;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "tb_user")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "created_date")
    LocalDateTime createdDate;
    @Column(name = "updated_date")
    LocalDateTime updatedDate;

    Status status;

    String name;
    String password;
    int age;
    String email;

}
