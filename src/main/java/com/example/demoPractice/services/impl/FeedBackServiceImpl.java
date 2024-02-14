package com.example.demoPractice.services.impl;

import com.example.demoPractice.exception.NotFoundException;
import com.example.demoPractice.mapper.FeedBackMapper;
import com.example.demoPractice.mapper.UserMapper;
import com.example.demoPractice.model.DTO.FeedBackDto;
import com.example.demoPractice.model.entity.Feedback;
import com.example.demoPractice.model.enums.Status;
import com.example.demoPractice.model.request.FeedBackCreateRequest;
import com.example.demoPractice.repository.FeedBackRepository;
import com.example.demoPractice.services.FeedBackService;
import com.example.demoPractice.services.RestaurantService;
import com.example.demoPractice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor

public class FeedBackServiceImpl implements FeedBackService {

    private final FeedBackRepository repository;
    private final RestaurantService restaurantService;
    private final UserService userService;


    @Override
    public FeedBackDto save(FeedBackCreateRequest request) {
//        Feedback entity = Feedback.builder()
//                .createdDate(LocalDateTime.now())
//                .updatedDate(LocalDateTime.now())
//                .status(Status.ACTIVE)
//                .comment(request.getComment())
//                .rate(request.getRate())
//                .user(UserMapper.INSTANCE.toEntity(userService.getById(request.getUserId())))
//
//                .build();
//        return null;
//
        return FeedBackMapper.INSTANCE.toDto(repository.save(null));
    }

    @Override
    public FeedBackDto getById(Long id) {

        return FeedBackMapper.INSTANCE.toDto(repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Отзыв с id " + id + " не найдено")));
    }

    @Override
    public List<FeedBackDto> getAllByRestaurantId(Long restaurantId) {
        return null;
    }

    @Override
    public List<FeedBackDto> getAllByUserId(Long userId) {
        return null;
    }

    @Override
    public FeedBackDto edit(String message, Integer rate, Long id) {
        return null;
    }

    @Override
    public FeedBackDto update(FeedBackDto dto) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
