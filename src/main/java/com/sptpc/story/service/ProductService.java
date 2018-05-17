package com.sptpc.story.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.story.domain.Product;
import com.sptpc.story.persistence.ProductMapper;

@Service
public class ProductService {
	@Autowired
	private ProductMapper productMapper;

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productMapper.queryAllProducts();
	}

	public List<Product> getHotProducts() {
		// TODO Auto-generated method stub
		return productMapper.queryHotProducts();
	}

	public List<Product> getNewProducts() {
		// TODO Auto-generated method stub
		return productMapper.queryNewProducts();
	}

	public Product findProductByID(String id) {
		// TODO Auto-generated method stub
		return productMapper.queryProductByID(id);
	}

	

}
