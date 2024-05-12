package com.ptm.demoqlbh.service;

import com.ptm.demoqlbh.model.Customer;
import com.ptm.demoqlbh.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    public List<Customer> getCustomerById(int id) {
        return (List<Customer>) customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getCustomerByName(String name) {
        return (List<Customer>) customerRepository.findByName(name);
    }

    public String deleteCustomer(int id) {
        customerRepository.deleteById(id);
        return "category removed" + id;
    }

    public Customer updateCustomer(Customer customer) {
        Customer existingCustomer = customerRepository.findById(customer.getId()).orElse(null);

        existingCustomer.setName(customer.getName());

        existingCustomer.setEmail(customer.getEmail());

        existingCustomer.setPhone(customer.getPhone());

        existingCustomer.setAddress(customer.getAddress());

        existingCustomer.setCreatedDate(customer.getCreatedDate());

        existingCustomer.setGender(customer.getGender());

        existingCustomer.setBirthday(customer.getBirthday());

        return customerRepository.save(existingCustomer);
    }
}
