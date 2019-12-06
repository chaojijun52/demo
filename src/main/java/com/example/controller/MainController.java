package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@Controller
@RequestMapping("/demo")
public class MainController {
@Autowired
private ProductRepository productRepository;

@PostMapping(path="/add")
public @ResponseBody String addNewProduct(@RequestBody Product product) {
//	Product product=new Product();
//	product.setName(name);
	productRepository.save(product);
	return "saved";
}

@GetMapping("/all")
public @ResponseBody Iterable<Product> getAllProducts(){
	return this.productRepository.findAll();
}

@PutMapping("/change/{id}")
public @ResponseBody String changeProduct(@PathVariable("id") Integer id, @RequestParam String name) {
	Product product=this.productRepository.findById(id).get();
	product.setName(name);
	this.productRepository.save(product);
	return "Changed";
}

@DeleteMapping("/delete/{id}")
public @ResponseBody String deleteById(@PathVariable("id") Integer id) {
	this.productRepository.deleteById(id);
	return "Product of id "+id+" deleted";
}
}
