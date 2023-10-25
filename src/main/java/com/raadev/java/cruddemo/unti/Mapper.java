package com.raadev.java.cruddemo.unti;

import com.raadev.java.cruddemo.dto.BrandDTO;
import com.raadev.java.cruddemo.entity.Brand;

public class Mapper {
    public static Brand toBrand(BrandDTO brandDTO){
        Brand brand = new Brand();
//        brand.setId(brandDTO.getId());
        brand.setName(brandDTO.getName());
        return brand;
    }

    public static BrandDTO toBrandDTO(Brand brand){
        BrandDTO brandDTO = new BrandDTO();
        brandDTO.setName(brand.getName());
        return brandDTO;
    }
}
