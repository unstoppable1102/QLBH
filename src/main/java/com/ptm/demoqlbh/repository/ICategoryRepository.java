package com.ptm.demoqlbh.repository;

import com.ptm.demoqlbh.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {
    Category findByName(String name);
}
