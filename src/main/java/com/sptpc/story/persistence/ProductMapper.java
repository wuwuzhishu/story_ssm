package com.sptpc.story.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sptpc.story.domain.Product;

@Repository
public interface ProductMapper {

	List<Product> queryAllProducts();

	List<Product> queryHotProducts();

	List<Product> queryNewProducts();

	Product queryProductByID(String id);

}
