package com.example.demoPractice.model.DTO;

import com.example.demoPractice.model.entity.Restaurant;
import com.example.demoPractice.model.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class RoomDto {
    Long id;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    Status status;
    RestaurantDto restaurant;
    Integer capacity;
    Integer price;
    String name;

}
