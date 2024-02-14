package com.example.demoPractice.model.DTO;

import com.example.demoPractice.model.entity.Room;
import com.example.demoPractice.model.enums.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class BookDto {
    Long id;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    Status status;
    LocalDate bookingDate;
    RoomDto room;
}
