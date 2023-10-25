package com.raadev.java.cruddemo.service;

import com.raadev.java.cruddemo.entity.Brand;

public interface BrandService {
     Brand create (Brand brand);
     Brand getById(Integer id);
     Brand update(Integer id,Brand brandUpdate);
     void deleteBrand (Integer id);
}
