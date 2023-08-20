package com.rishi.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishi.project.model.Product;
import com.rishi.project.repository.ProductsRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class ProductController {
	
	@Autowired
	private ProductsRepository productsRepository;
	
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productsRepository.findAll();
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return productsRepository.save(product);
	}

}
