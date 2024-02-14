package com.example.demoPractice.services;

import com.example.demoPractice.model.entity.Address;
import com.example.demoPractice.model.request.AddressCreateRequest;
import org.springframework.stereotype.Service;

@Service
public interface AddressService {

    Address save(AddressCreateRequest request);
    Address getById(Long id);

}
