package com.raadev.java.cruddemo.impl;

import com.raadev.java.cruddemo.entity.Brand;
import com.raadev.java.cruddemo.exception.ApiException;
import com.raadev.java.cruddemo.repository.BrandRepository;
import com.raadev.java.cruddemo.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;
    @Override
    public Brand create(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public Brand getById(Integer id) {
        return brandRepository.findById(id)
                .orElseThrow(() ->new ApiException(HttpStatus.NOT_FOUND,String.format("Brand id = %d not found",id)));

    }

    @Override
    public Brand update(Integer id, Brand brandUpdate) {
        Brand brand = getById(id);
        brand.setName(brandUpdate.getName());
        return brandRepository.save(brand);
    }

    @Override
    public void deleteBrand(Integer id) {
        brandRepository.deleteById(id);
    }


}
