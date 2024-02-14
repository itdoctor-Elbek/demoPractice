package com.example.demoPractice.services.impl;

import com.example.demoPractice.mapper.RestaurantMapper;
import com.example.demoPractice.model.DTO.RestaurantDto;
import com.example.demoPractice.model.entity.Restaurant;
import com.example.demoPractice.model.enums.Status;
import com.example.demoPractice.model.request.RestaurantCreateRequest;
import com.example.demoPractice.model.response.RestaurantResponseMainPage;
import com.example.demoPractice.repository.RestaurantRepository;
import com.example.demoPractice.services.RestaurantService;
import com.example.demoPractice.services.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository repository;
    private final RoomService roomService;
    @Override
    public List<RestaurantDto> getAll() {
        List<Restaurant> restaurantList = (List<Restaurant>) repository.findAll();
        return RestaurantMapper.INSTANCE.toDtos(restaurantList);
    }


    @Override
    public RestaurantDto getById(Long id) {
        return RestaurantMapper.INSTANCE.toDto(repository.findById(id).orElseThrow());
    }

    @Override
    public RestaurantDto save(RestaurantCreateRequest request) {
        RestaurantDto restaurant = RestaurantDto.builder()
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .status(Status.ACTIVE)
                .name(request.getName())
                .build();

        restaurant = repository.save(restaurant);

        return RestaurantMapper.INSTANCE.toDto(restaurant);
    }

    @Override
    public List<RestaurantResponseMainPage> getRestaurantsMainPage() {

        List<Restaurant> restaurantList = repository.findAll();

        List<RestaurantResponseMainPage> restaurantResponseMainPages = new ArrayList<>();

        for (Restaurant item : restaurantList){
            RestaurantResponseMainPage response = RestaurantResponseMainPage.builder()
                    .restaurantId(item.getId())
                    .restaurantName(item.getName())
                    .roomCount(roomService.countOfRoomsByRestaurantId(item.getId()))
                    .avgCapacity(roomService.avgCapacityOfRoomsByRestaurantId(item.getId()))
                    .avgPrice(roomService.avgPriceOfRoomsByRestaurantId(item.getId()))
                    .build();


            restaurantResponseMainPages.add(response);
        }
        return null;
    }

}
