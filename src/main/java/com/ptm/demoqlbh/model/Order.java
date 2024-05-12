package com.ptm.demoqlbh.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "tbl_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "customer_id")
    private Integer customerId;

    private byte status;

    @Column(name = "order_date")
    private Date orderDate;






}
