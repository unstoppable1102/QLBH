package com.ptm.demoqlbh.service;

import com.ptm.demoqlbh.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService extends GenericService<Customer,Integer> {
    public Customer findByName(String name);
}
