package com.monteiro.ecom_proj.repo;

import com.monteiro.ecom_proj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{//product & orimary key

}
