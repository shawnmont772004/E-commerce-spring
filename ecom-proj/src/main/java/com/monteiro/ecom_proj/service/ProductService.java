package com.monteiro.ecom_proj.service;

import com.monteiro.ecom_proj.model.Product;
import com.monteiro.ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService  {

    @Autowired
    private ProductRepo repo;


    public  List<Product> getAllProducts() {
        return repo.findAll(); //method from Jpa repo
    }

    public Product getProductById(int id){
        //return repo.findById(id).orElse(new Product());// to return a product with null fields
        return repo.findById(id).orElse(null); //to return null
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImgName(imageFile.getOriginalFilename());
        product.setImgType(imageFile.getContentType());
        product.setImageDate(imageFile.getBytes());
        return repo.save(product);
        //but we also need to save image
    }
}
