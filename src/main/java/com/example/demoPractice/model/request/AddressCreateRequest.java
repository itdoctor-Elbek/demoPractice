package com.example.demoPractice.model.request;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;



public record AddressCreateRequest(
        String city,
        String street,
        Double lat,
        Double lon,
        Long restaurantId
){
}
