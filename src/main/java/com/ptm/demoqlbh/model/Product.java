package com.ptm.demoqlbh.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private byte status;

    private double price;

    private double sale_price;

    private int category_id;
}
