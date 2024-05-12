package com.ptm.demoqlbh.service;

import com.ptm.demoqlbh.model.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService extends GenericService<Category, Integer> {
    Category findByName(String name);
}
