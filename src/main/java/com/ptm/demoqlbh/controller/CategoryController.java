package com.ptm.demoqlbh.controller;
import com.ptm.demoqlbh.model.Category;
import com.ptm.demoqlbh.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @PostMapping
    public Category create(@RequestBody Category category){
        return  categoryService.save(category);
    }


    @GetMapping("/{id}")
    public Category findById(@PathVariable int id){
        return (Category) categoryService.findById(id);
    }

    @GetMapping("/categories/{name}")
    public Category findByName(@PathVariable String name){
        return (Category) categoryService.findByName(name);
    }

    @PutMapping("/{id}")
    public  Category update(@RequestBody Category category){
        return  categoryService.update(category);
    }

    @DeleteMapping("/{id}")
    public void delete( @PathVariable int id){
         categoryService.delete(id);
    }
}


