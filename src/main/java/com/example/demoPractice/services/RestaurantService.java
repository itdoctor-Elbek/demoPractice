package com.example.demoPractice.services;

import com.example.demoPractice.model.DTO.RestaurantDto;
import com.example.demoPractice.model.request.RestaurantCreateRequest;
import com.example.demoPractice.model.response.RestaurantResponseMainPage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurantService {
    List<RestaurantDto> getAll();

    RestaurantDto getById(Long id);

    RestaurantDto save(RestaurantCreateRequest request);

    List<RestaurantResponseMainPage> getRestaurantsMainPage();
}
