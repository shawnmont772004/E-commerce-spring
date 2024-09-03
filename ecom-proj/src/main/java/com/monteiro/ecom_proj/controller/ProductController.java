package com.monteiro.ecom_proj.controller;

import com.monteiro.ecom_proj.model.Product;
import com.monteiro.ecom_proj.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

        Product product = service.getProductById(id);
        if(product!=null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //to add product we use post, also if no img is added then @RequestBody  was enough but we also use reqpart as img is added
    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product,
                                              @RequestPart MultipartFile imageFile){
           try{
               Product prod = service.addProduct(product,imageFile);
               return new ResponseEntity<>(prod,HttpStatus.OK);
           }
           catch(Exception e){
               return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
           }
    }
}
