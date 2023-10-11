package com.ptm.demoqlbh.controller;

import com.ptm.demoqlbh.model.Product;
import com.ptm.demoqlbh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return  productService.saveProduct(product);
    }

    @GetMapping("/lists")
    public List<Product> findAllProducts(){
        return productService.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product findCategoryById(@PathVariable int id){
        return (Product) productService.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name){
        return (Product) productService.getProductByName(name);
    }

    @PutMapping("/update")
    public  Product updateProduct(@RequestBody Product product){
        return  productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct( @PathVariable int id){
        return productService.deleteProduct(id);
    }
}
