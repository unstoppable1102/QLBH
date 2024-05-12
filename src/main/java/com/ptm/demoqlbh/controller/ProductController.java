package com.ptm.demoqlbh.controller;

import com.ptm.demoqlbh.model.Product;
import com.ptm.demoqlbh.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {


    private final ProductService productService;

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.save(product);
    }

    @GetMapping
    public List<Product> findAllProducts(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findCategoryById(@PathVariable int id){
        return productService.findById(id);
    }

    @GetMapping("/{name}")
    public List<Product> findProductByName(@PathVariable String name){
        return productService.findByName(name);
    }

    @PutMapping("/{id}")
    public  Product updateProduct(@RequestBody Product product){
        return  productService.update(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct( @PathVariable int id){
        productService.delete(id);
        return "Product deleted";
    }
}
