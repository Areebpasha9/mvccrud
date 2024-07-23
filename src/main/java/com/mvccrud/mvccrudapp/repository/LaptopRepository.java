package com.mvccrud.mvccrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvccrud.mvccrudapp.entity.laptop;
@Repository
public interface LaptopRepository   extends JpaRepository<laptop,Integer> {
     
}
