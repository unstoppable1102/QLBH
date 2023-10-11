package com.ptm.demoqlbh.service;

import com.ptm.demoqlbh.model.Product;
import com.ptm.demoqlbh.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private IProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }


    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductById(int id) {
        return (List<Product>) productRepository.findById(id).orElse(null);
    }

    public List<Product> getProductByName(String name) {
        return (List<Product>) productRepository.findByName(name);
    }

    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "Product removed" + id;
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);

        existingProduct.setName(product.getName());

        existingProduct.setStatus(product.getStatus());

        existingProduct.setPrice(product.getPrice());

        existingProduct.setSale_price(product.getSale_price());

        existingProduct.setCategory_id(product.getCategory_id());

        return productRepository.save(existingProduct);
    }
}
