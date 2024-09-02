package com.monteiro.ecom_proj.controller;

import com.monteiro.ecom_proj.model.Product;
import com.monteiro.ecom_proj.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greetMe(){
        return "Hello World!";
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        //return service.getAllProducts();
        //to return the response along with data and http status code
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);//create a ResponseEntity object
        //and then pass a call to service and http status
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){
        return new ResponseEntity<>(service.getProductById(id),HttpStatus.OK);
    }
}
