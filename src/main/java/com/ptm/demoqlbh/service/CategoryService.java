package com.ptm.demoqlbh.service;

import com.ptm.demoqlbh.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService extends GenericService<Category, Integer> {
    List<Category> findByName(String name);
}
