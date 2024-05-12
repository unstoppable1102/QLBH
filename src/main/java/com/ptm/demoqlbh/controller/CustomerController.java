package com.ptm.demoqlbh.controller;

import com.ptm.demoqlbh.model.Customer;
import com.ptm.demoqlbh.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return  customerService.save(customer);
    }


    @GetMapping
    public List<Customer> findAllCustomers(){
        return customerService.findAll();
    }

    @GetMapping("/{id}")
    public Customer findCustomerById(@PathVariable int id){
        return  customerService.findById(id);
    }

    @GetMapping("/{name}")
    public Customer findCategoryByName(@PathVariable String name){
        return customerService.findByName(name);
    }

    @PutMapping("/{id}")
    public  Customer updateCustomer(@RequestBody Customer customer){
        return  customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer( @PathVariable int id){
         customerService.delete(id);
         return "Customer deleted";
    }

}
