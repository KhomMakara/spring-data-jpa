package com.raadev.java.cruddemo.repository;

import com.raadev.java.cruddemo.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer>{

}