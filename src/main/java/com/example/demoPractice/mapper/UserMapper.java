package com.example.demoPractice.mapper;

import com.example.demoPractice.model.DTO.UserDto;
import com.example.demoPractice.model.entity.User;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.mapstruct.factory.Mappers;

public interface UserMapper extends BaseMapper<User,UserDto> {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
}
