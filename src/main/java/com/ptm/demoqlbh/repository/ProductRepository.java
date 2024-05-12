package com.ptm.demoqlbh.repository;

import com.ptm.demoqlbh.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
