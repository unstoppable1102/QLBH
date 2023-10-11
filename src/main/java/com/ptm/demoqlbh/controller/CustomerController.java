package com.ptm.demoqlbh.controller;

import com.ptm.demoqlbh.model.Category;
import com.ptm.demoqlbh.model.Customer;
import com.ptm.demoqlbh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customer){
        return  customerService.saveCustomer(customer);
    }


    @GetMapping("/lists")
    public List<Customer> findAllCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer findCustomerById(@PathVariable int id){
        return (Customer) customerService.getCustomerById(id);
    }

    @GetMapping("/customer/{name}")
    public Customer findCategoryByName(@PathVariable String name){
        return (Customer) customerService.getCustomerByName(name);
    }

    @PutMapping("/update")
    public  Customer updateCustomer(@RequestBody Customer customer){
        return  customerService.updateCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCustomer( @PathVariable int id){
        return customerService.deleteCustomer(id);
    }

}
