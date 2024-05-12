package com.ptm.demoqlbh.controller;

import com.ptm.demoqlbh.model.Product;
import com.ptm.demoqlbh.service.impl.ProductServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceimpl productServiceimpl;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product){
        return  productServiceimpl.saveProduct(product);
    }

    @GetMapping("/lists")
    public List<Product> findAllProducts(){
        return productServiceimpl.getProducts();
    }

    @GetMapping("/product/{id}")
    public Product findCategoryById(@PathVariable int id){
        return (Product) productServiceimpl.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name){
        return (Product) productServiceimpl.getProductByName(name);
    }

    @PutMapping("/update")
    public  Product updateProduct(@RequestBody Product product){
        return  productServiceimpl.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct( @PathVariable int id){
        return productServiceimpl.deleteProduct(id);
    }
}
