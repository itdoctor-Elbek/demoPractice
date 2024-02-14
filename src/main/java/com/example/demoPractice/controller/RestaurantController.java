package com.example.demoPractice.controller;

import com.example.demoPractice.model.DTO.RestaurantDto;
import com.example.demoPractice.model.entity.Restaurant;
import com.example.demoPractice.model.request.RestaurantCreateRequest;
import com.example.demoPractice.services.RestaurantService;
import com.example.demoPractice.services.impl.RestaurantServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/restaurant")
public class RestaurantController {

    private final RestaurantService service;


    @GetMapping
    public List<RestaurantDto> getAll(){
        return  service.getAll();

    }

    @GetMapping("/id")
    public ResponseEntity<?> getById(@RequestParam(required = false, defaultValue = "1L") Long id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody RestaurantCreateRequest request){
        return ResponseEntity.ok(service.save(request));
    }

    @GetMapping("/getMainPage")
    public ResponseEntity<?> getMainPage(){
        return ResponseEntity.ok(service.getRestaurantsMainPage());
    }

}
