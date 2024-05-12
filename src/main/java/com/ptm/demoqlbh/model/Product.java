package com.ptm.demoqlbh.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private byte status;

    private double price;

    @Column(name = "sale_price")
    private double salePrice;
    @Column(name = "category_id")
    private Integer categoryId;
}
