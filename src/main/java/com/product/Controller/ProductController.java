package com.product.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.Entity.Product;
import com.product.exception.BrandNotFounds;
import com.product.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;
	
	@PostMapping(value="/setProduct")
	public String setProduct(@RequestBody List<Product> p) {
		return ps.setProduct(p);
		
	}
	@GetMapping(value="/getById/{id}")
	public Product getById(@PathVariable int id) {
		return ps.getById(id);
	}
	@GetMapping(value="/getByNae/{name}")
	public Product getByN(@PathVariable String name) throws BrandNotFounds {
		return ps.getByN(name);
	}

}
