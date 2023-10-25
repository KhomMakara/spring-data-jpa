package com.raadev.java.cruddemo.controller;

import com.raadev.java.cruddemo.dto.BrandDTO;
import com.raadev.java.cruddemo.entity.Brand;
import com.raadev.java.cruddemo.exception.ApiException;
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

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneBrand(@PathVariable("id") Integer brandId) {
       Brand brand = brandService.getById(brandId);
       return ResponseEntity.ok(Mapper.toBrandDTO(brand));

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBrand(@PathVariable("id") Integer brandId, @RequestBody BrandDTO brandDTO){
        Brand brand = Mapper.toBrand(brandDTO);
        Brand brandUpdate = brandService.update(brandId,brand);
        return ResponseEntity.ok(Mapper.toBrandDTO(brandUpdate));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBrand(@PathVariable("id") Integer brandId){
        brandService.deleteBrand(brandId);
        return ResponseEntity.ok("Brand id = " + brandId + "delete Success");
    }




}
