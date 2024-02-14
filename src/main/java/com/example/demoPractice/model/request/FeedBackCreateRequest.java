package com.example.demoPractice.model.request;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class FeedBackCreateRequest {
    String comment;
    Long userId;
    Long restaurantId;
    Integer rate;
}
