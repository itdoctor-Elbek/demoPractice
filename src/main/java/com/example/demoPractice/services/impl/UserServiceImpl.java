package com.example.demoPractice.services.impl;

import com.example.demoPractice.exception.NotFoundException;
import com.example.demoPractice.mapper.UserMapper;
import com.example.demoPractice.model.DTO.UserDto;
import com.example.demoPractice.model.entity.User;
import com.example.demoPractice.model.enums.Status;
import com.example.demoPractice.model.request.UserCreateRequest;
import com.example.demoPractice.repository.UserRepository;
import com.example.demoPractice.services.UserService;
import com.example.demoPractice.utils.Language;
import com.example.demoPractice.utils.ResourceBundleLanguage;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ResourceBundle;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public UserDto save(UserCreateRequest request) {
        User entity = User.builder()
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .status(Status.ACTIVE)
                .age(request.getAge())
                .name(request.getName())
                .password(request.getPassword())
                .email(request.getEmail())
                .build();
        return UserMapper.INSTANCE.toDto(userRepository.save(entity));
    }

    @Override
    public UserDto getById(Long id, int languageOrdinal) {
        Language language = Language.getLanguage(languageOrdinal);

        return UserMapper.INSTANCE.toDto(userRepository.findById(id)
                .orElseThrow(()
                -> new NotFoundException(ResourceBundleLanguage.periodMessage(language,"entityNotFound"))));


    }
}
