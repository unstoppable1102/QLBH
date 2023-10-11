package com.ptm.demoqlbh.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "order_detail")
public class Order_detail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;
    private int product_id;
    private int quantity;
    private double price;

    public Order_detail() {
    }

    public Order_detail(int order_id, int product_id, int quantity, double price) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.quantity = quantity;
        this.price = price;
    }

    public int getOrder_detail() {
        return order_id;
    }

    public void setOrder_detail(int order_detail) {
        this.order_id = order_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getId() {
        return null;
    }
}
