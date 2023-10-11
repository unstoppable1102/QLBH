package com.ptm.demoqlbh.repository;

import com.ptm.demoqlbh.model.Category;
import com.ptm.demoqlbh.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByName(String name);
}
