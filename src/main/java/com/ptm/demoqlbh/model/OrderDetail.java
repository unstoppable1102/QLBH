package com.ptm.demoqlbh.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;

    @Column(name = "product_id")
    private int productId;

    private int quantity;

    private double price;


}
