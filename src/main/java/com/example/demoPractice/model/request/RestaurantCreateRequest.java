package com.example.demoPractice.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class RestaurantCreateRequest {
    String name;
}

