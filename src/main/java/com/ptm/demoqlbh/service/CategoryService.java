package com.ptm.demoqlbh.service;

import com.ptm.demoqlbh.model.Category;
import com.ptm.demoqlbh.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }


    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public List<Category> getCategoryById(int id) {
        return (List<Category>) categoryRepository.findById(id).orElse(null);
    }

    public List<Category> getCategoryByName(String name) {
        return (List<Category>) categoryRepository.findByName(name);
    }

    public String deleteCategory(int id) {
        categoryRepository.deleteById(id);
        return "category removed" + id;
    }

    public Category updateCategory(Category category) {
        Category existingCategory = categoryRepository.findById(category.getId()).orElse(null);

        existingCategory.setName(category.getName());

        existingCategory.setStatus(category.getStatus());

        return categoryRepository.save(existingCategory);
    }
}
