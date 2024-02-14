package com.example.demoPractice.services;

import com.example.demoPractice.model.entity.Room;
import com.example.demoPractice.model.request.RoomCreateRequest;
import com.example.demoPractice.repository.projections.MainPageResponseProjection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {

    Room save(RoomCreateRequest request);
    Room getById(Long in);

    List<MainPageResponseProjection> getMainPage(String city);

    Integer countOfRoomsByRestaurantId(Long restaurantId);
    Integer avgPriceOfRoomsByRestaurantId(Long restaurantId);
    Integer avgCapacityOfRoomsByRestaurantId(Long restaurantId);

}
