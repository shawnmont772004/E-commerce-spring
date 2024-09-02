package com.monteiro.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
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
    //@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy") //conversion is done in frontend i.e react. if not specified use this code
    private Date releasedate;

    private String imgName;
    private String imgType;
    @Lob //when working with large objects
    private byte[] imageDate;

    private String brand;

}
