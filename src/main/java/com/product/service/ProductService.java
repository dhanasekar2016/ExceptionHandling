package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Dao.ProductDao;
import com.product.Entity.Product;
import com.product.exception.BrandNotFounds;


@Service
public class ProductService {
	@Autowired
	ProductDao pd;

	public String setProduct(List<Product> p) {
		
		return pd.setProduct(p);
	}

	public Product getById(int id) {
	
		return pd.getById(id);
	}

	public Product getByN(String name)throws BrandNotFounds {
		
			if(pd.getByN(name).isPresent()) {
				return pd.getByN(name).get();
			}else {
				throw new BrandNotFounds("Brand not found");
			}


		
	}

}
