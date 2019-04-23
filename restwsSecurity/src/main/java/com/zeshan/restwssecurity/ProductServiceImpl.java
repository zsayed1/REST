package com.zeshan.restwssecurity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.zeshan.restwssecurity.model.Product;
@Service
public class ProductServiceImpl implements ProductService {
	ArrayList<Product> products = new ArrayList<>();
	int id = 123;
	
	public ProductServiceImpl() {
		Product prod = new Product();
		prod.setProductid(id);
		prod.setProductName("Watch");
		prod.setType("Electronics");
		prod.setWeight(12);
		products.add(prod);
	}

	@Override
	public List<Product> getproduct() {
		//Since we have to return a string
		return products;
	}

	@Override
	public int addproduct(Product prod) {
		prod.setProductid(++id);
		products.add(prod);
		return prod.getProductid();
		
	}

}
