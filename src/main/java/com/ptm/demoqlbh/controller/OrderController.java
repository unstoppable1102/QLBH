package com.ptm.demoqlbh.controller;

import com.ptm.demoqlbh.model.Order;

import com.ptm.demoqlbh.service.OrderService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public Order addOrder(@RequestBody Order order){
        return  orderService.save(order);
    }

    @GetMapping
    public List<Order> findAllOrders(){
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public Order findOrderById(@PathVariable int id){
        return orderService.findById(id);
    }

    @PutMapping("/{id}")
    public  Order updateOrder(@RequestBody Order order){
        return orderService.update(order);
    }
    @DeleteMapping("/{id}")
    public String deleteOrder( @PathVariable int id){
       orderService.delete(id);
       return "Order deleted";
    }


}
