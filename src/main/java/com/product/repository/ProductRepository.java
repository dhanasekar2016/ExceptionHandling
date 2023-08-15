package com.product.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.product.Entity.Product;



public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query(value="select * from pro_details where name like ?",nativeQuery = true)
	Optional<Product> getByN(String name);

}
