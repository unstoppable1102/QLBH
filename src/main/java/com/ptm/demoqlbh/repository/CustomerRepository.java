package com.ptm.demoqlbh.repository;

import com.ptm.demoqlbh.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByName(String name);
}
