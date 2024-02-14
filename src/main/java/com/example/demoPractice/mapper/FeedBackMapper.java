package com.example.demoPractice.mapper;

import com.example.demoPractice.model.DTO.FeedBackDto;
import com.example.demoPractice.model.entity.Feedback;
import org.mapstruct.factory.Mappers;

public interface FeedBackMapper extends BaseMapper<Feedback, FeedBackDto> {

    FeedBackMapper INSTANCE = Mappers.getMapper(FeedBackMapper.class);
}
