package com.example.demoPractice.model.DTO;

import com.example.demoPractice.model.entity.Restaurant;
import com.example.demoPractice.model.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class RestaurantDto extends Restaurant {
    Long id;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    Status status;
    String name;
}
