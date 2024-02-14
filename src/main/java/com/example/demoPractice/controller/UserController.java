package com.example.demoPractice.controller;

import com.example.demoPractice.model.request.UserCreateRequest;
import com.example.demoPractice.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody @Valid UserCreateRequest request){
        return ResponseEntity.ok(request);
    }

    @GetMapping
    public ResponseEntity<?> getById(@RequestHeader int lang, @RequestParam Long id){
        return ResponseEntity.ok(userService.getById(id, lang));
    }
}
