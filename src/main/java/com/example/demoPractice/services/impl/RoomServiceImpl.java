package com.example.demoPractice.services.impl;

import com.example.demoPractice.model.entity.Room;
import com.example.demoPractice.model.enums.Status;
import com.example.demoPractice.model.request.RoomCreateRequest;
import com.example.demoPractice.repository.RoomRepository;
import com.example.demoPractice.repository.projections.MainPageResponseProjection;
import com.example.demoPractice.services.RestaurantService;
import com.example.demoPractice.services.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
@Component
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {
    private final RoomRepository repository;
    @Override
    public Room save(RoomCreateRequest request) {

//        Room room = Room.builder()
//                .created_date(LocalDateTime.now())
//                .updated_date(LocalDateTime.now())
//                .price(request.price())
//                .name(request.name())
//                .capacity(request.capacity())
//                .status(Status.ACTIVE)
//                .restaurant(restaurantService.getById(request.restaurantId()))
//                .build();
//        return repository.save(room);
        return null;
    }

    @Override
    public Room getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<MainPageResponseProjection> getMainPage(String city) {
        return repository.findRoomsByCity(city);
    }

    @Override
    public Integer countOfRoomsByRestaurantId(Long restaurantId) {
        return repository.countOfRoomsByRestaurantId(restaurantId);
    }

    @Override
    public Integer avgPriceOfRoomsByRestaurantId(Long restaurantId) {
        return repository.avgPriceOfRoomsByRestaurantId(restaurantId);
    }

    @Override
    public Integer avgCapacityOfRoomsByRestaurantId(Long restaurantId) {
        return repository.avgCapacityOfRoomsByRestaurantId(restaurantId);
    }
}
