package com.raadev.java.cruddemo.controller;

import com.raadev.java.cruddemo.dto.BrandDTO;
import com.raadev.java.cruddemo.entity.Brand;
import com.raadev.java.cruddemo.service.BrandService;
import com.raadev.java.cruddemo.unti.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/brands")
public class BrandController {


    @Autowired
    private BrandService brandService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO){
        Brand brand = Mapper.toBrand(brandDTO);
        brand = brandService.create(brand);
        return ResponseEntity.ok(Mapper.toBrandDTO(brand));
    }
}
