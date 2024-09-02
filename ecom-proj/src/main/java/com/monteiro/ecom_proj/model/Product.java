package com.monteiro.ecom_proj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.math.BigDecimal;
import java.util.Date;

//to create table
@Entity
//using lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id //primary key
    private int id;
    private String name;
    private String descp;
    private BigDecimal price;
    private String category;
    private boolean avail;
    private int qty;
    private Date releasedate;

}
