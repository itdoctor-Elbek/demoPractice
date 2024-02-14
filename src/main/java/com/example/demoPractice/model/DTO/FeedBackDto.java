package com.example.demoPractice.model.DTO;

import com.example.demoPractice.model.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@ToString
public class FeedBackDto {
    Long id;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    Status status;
    String comment;
    UserDto user;
    RestaurantDto restaurant;
    Integer rate;


}
