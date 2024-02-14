package com.example.demoPractice.services;

import com.example.demoPractice.model.DTO.FeedBackDto;
import com.example.demoPractice.model.request.FeedBackCreateRequest;

import java.util.List;

public interface FeedBackService {
    FeedBackDto save(FeedBackCreateRequest request);
    FeedBackDto getById(Long id);
    List<FeedBackDto> getAllByRestaurantId(Long restaurantId);
    List<FeedBackDto> getAllByUserId(Long userId);
    FeedBackDto edit(String message, Integer rate, Long id);
    FeedBackDto update(FeedBackDto dto);
    Boolean delete(Long id);
}
