package com.sapient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.pojo.Product;
import com.sapient.service.IProductCatalogueService;

@RestController
@RequestMapping("/product")
public class ProductCatalogueController {

	@Autowired
	private IProductCatalogueService iProductCatalogueService;
	
	@PostMapping
	public ResponseEntity<String> createNewProduct(@RequestBody Product product) {
		
		iProductCatalogueService.createProduct(product);
		
		return new ResponseEntity<>(product.getProductName() + " Client has been created successfully.",
				HttpStatus.CREATED);
	}
	
	@RequestMapping("/get")
	public ResponseEntity<String> getProduct(){
		Product p = new Product();
		return new ResponseEntity<>(p.getOs(), HttpStatus.OK);
	}
	
	
}
