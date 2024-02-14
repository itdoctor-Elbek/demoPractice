package com.example.demoPractice.controller;

import com.example.demoPractice.model.entity.Address;
import com.example.demoPractice.model.entity.Restaurant;
import com.example.demoPractice.model.entity.Room;
import com.example.demoPractice.model.request.AddressCreateRequest;
import com.example.demoPractice.model.request.RestaurantCreateRequest;
import com.example.demoPractice.model.request.RoomCreateRequest;
import com.example.demoPractice.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/address")
public class AddressController{

    @Qualifier("addressService")
    private final AddressService service;

    @PostMapping
    public ResponseEntity<Address> save(@RequestBody AddressCreateRequest request){
        return ResponseEntity.ok(service.save(request));
    }
}
