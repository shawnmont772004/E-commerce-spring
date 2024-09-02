package com.monteiro.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY) //TO GENERATE ID BY BY THE DB
    private int id;
    private String name;
    private String descp;
    private BigDecimal price;
    private String category;
    private boolean avail;
    private int qty;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
    private Date releasedate;

}
