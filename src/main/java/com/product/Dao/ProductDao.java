package com.product.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.Entity.Product;
import com.product.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;

	public String setProduct(List<Product> p) {
		pr.saveAll(p);
		return "Saved";
	}

	public Product getById(int id) {
	
		return pr.findById(id).get();
	}

	public Optional<Product> getByN(String name) {
		
		return pr.getByN(name);
	}

}

