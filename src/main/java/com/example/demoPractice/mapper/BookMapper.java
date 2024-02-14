package com.example.demoPractice.mapper;

import com.example.demoPractice.model.DTO.BookDto;
import com.example.demoPractice.model.entity.Book;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper extends BaseMapper<Book, BookDto> {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
}
