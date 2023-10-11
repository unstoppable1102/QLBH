package com.ptm.demoqlbh.controller;
import com.ptm.demoqlbh.model.Category;
import com.ptm.demoqlbh.service.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/add")
    public Category addCategory(@RequestBody Category category){
        return  categoryService.saveCategory(category);
    }


    @GetMapping("/lists")
    public List<Category> findAllCategories(){
        return categoryService.getCategories();
    }

    @GetMapping("/categories/{id}")
    public Category findCategoryById(@PathVariable int id){
        return (Category) categoryService.getCategoryById(id);
    }

    @GetMapping("/categories/{name}")
    public Category findCategoryByName(@PathVariable String name){
        return (Category) categoryService.getCategoryByName(name);
    }

    @PutMapping("/update")
    public  Category updateCategory(@RequestBody Category category){
        return  categoryService.updateCategory(category);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCategory( @PathVariable int id){
        return categoryService.deleteCategory(id);
    }
}


