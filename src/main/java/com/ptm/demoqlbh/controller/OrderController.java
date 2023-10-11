package com.ptm.demoqlbh.controller;

import com.ptm.demoqlbh.model.Customer;
import com.ptm.demoqlbh.model.Order;
import com.ptm.demoqlbh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    public Order addOrder(@RequestBody Order order){
        return  orderService.saveOrder(order);
    }

    @GetMapping("/lists")
    public List<Order> findAllOrders(){
        return orderService.getOrders();
    }

    @GetMapping("/orders/{id}")
    public Order findOrderById(@PathVariable int id){
        return (Order) orderService.getOrderById(id);
    }

    @PutMapping("/update")
    public  Order updateOrder(@RequestBody Order order){
        return  orderService.updateOrder(order);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteOrder( @PathVariable int id){
        return orderService.deleteOrder(id);
    }


}
