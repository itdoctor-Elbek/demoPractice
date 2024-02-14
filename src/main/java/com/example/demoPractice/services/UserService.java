package com.example.demoPractice.services;

import com.example.demoPractice.model.DTO.UserDto;
import com.example.demoPractice.model.request.UserCreateRequest;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    UserDto save(UserCreateRequest request);

    UserDto getById(Long id, int languageOrdinal);
}
