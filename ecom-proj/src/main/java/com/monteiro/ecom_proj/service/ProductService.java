package com.monteiro.ecom_proj.service;

import com.monteiro.ecom_proj.model.Product;
import com.monteiro.ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService  {

    @Autowired
    private ProductRepo repo;


    public  List<Product> getAllProducts() {
        return repo.findAll(); //method from Jpa repo
    }
}
