package com.ptm.demoqlbh.service;

import com.ptm.demoqlbh.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService extends GenericService<Product, Integer> {
    List<Product> findByName(String name);
}
