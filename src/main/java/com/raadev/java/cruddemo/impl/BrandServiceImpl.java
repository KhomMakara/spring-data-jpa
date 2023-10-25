package com.raadev.java.cruddemo.impl;

import com.raadev.java.cruddemo.entity.Brand;
import com.raadev.java.cruddemo.repository.BrandRepository;
import com.raadev.java.cruddemo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;
    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }



}
