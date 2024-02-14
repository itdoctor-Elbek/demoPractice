package com.example.demoPractice.services.impl;

import com.example.demoPractice.model.entity.Address;
import com.example.demoPractice.model.enums.Status;
import com.example.demoPractice.model.request.AddressCreateRequest;
import com.example.demoPractice.repository.AddressRepository;
import com.example.demoPractice.services.AddressService;
import com.example.demoPractice.services.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
@Component
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final RestaurantService restaurantService;
    private final AddressRepository repository;


    @Override
    public Address save(AddressCreateRequest request) {

        Address address = Address.builder()
                .created_date(LocalDateTime.now())
                .updated_date(LocalDateTime.now())
                .status(Status.ACTIVE)
                .city(request.city())
                .street(request.street())
                .lat(request.lat())
                .lon(request.lon())
                .restaurant(restaurantService.getById(request.restaurantId()))
                .build();
        return repository.save(address);
    }

    @Override
    public Address getById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
