package com.laptop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laptop.entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer>{
	
}
