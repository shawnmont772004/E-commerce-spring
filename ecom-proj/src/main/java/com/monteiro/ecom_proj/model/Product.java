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
    private String description;
    private BigDecimal price;
    private String category;
    private boolean productavailable;
    private int stockquantity;
    //@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy") //conversion is done in frontend i.e react. if not specified use this code
    private Date releasedate;

    private String imageName;
    private String imageType;
    @Lob //when working with large objects
    private byte[] imageDate;

    private String brand;

    //manually generating setters as lombok is not configured properly. Issue will be resolved later
    public void setImgName(String imageName) {
        this.imageName = imageName;
    }

    public void setImgType(String imageType) {
        this.imageType = imageType;
    }

    public void setImageDate(byte[] imageDate) {
        this.imageDate = imageDate;
    }

    public byte[] getImageDate() {
        return this.imageDate;
    }

    public String getImageType() {
        return this.imageType;
    }
}
