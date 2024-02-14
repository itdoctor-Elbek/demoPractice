package com.example.demoPractice.controller;

import com.example.demoPractice.model.entity.Restaurant;
import com.example.demoPractice.model.entity.Room;
import com.example.demoPractice.model.request.RestaurantCreateRequest;
import com.example.demoPractice.model.request.RoomCreateRequest;
import com.example.demoPractice.services.AddressService;
import com.example.demoPractice.services.RestaurantService;
import com.example.demoPractice.services.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/room")
public class RoomController {

    @Qualifier("roomService")
    private final RoomService service;
    @PostMapping
    public ResponseEntity<Room> save(@RequestBody RoomCreateRequest request){
        return ResponseEntity.ok(service.save(request));
    }

    @GetMapping("/main")
    public ResponseEntity<?> getMainPage(@RequestParam String city){
        return ResponseEntity.ok(service.getMainPage(city));
    }
}
