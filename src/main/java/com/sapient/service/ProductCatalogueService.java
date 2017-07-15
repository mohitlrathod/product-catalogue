package com.sapient.service;

import org.springframework.stereotype.Service;

import com.sapient.pojo.Product;

@Service
public class ProductCatalogueService implements IProductCatalogueService {

	@Override
	public Product createProduct(Product product) {
		product.setProductName("New Object");
		return product;
	}

	
	
}
