package com.ptm.demoqlbh.repository;

import com.ptm.demoqlbh.model.Category;
import com.ptm.demoqlbh.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
