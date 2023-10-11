package com.ptm.demoqlbh.controller;

import com.ptm.demoqlbh.model.Order_detail;
import com.ptm.demoqlbh.service.Order_detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order_detail")
public class Order_detailController {

    @Autowired
    private Order_detailService order_detailService;

    @PostMapping("/add")
    public Order_detail addOrder_detail(@RequestBody Order_detail order_detail){
        return  order_detailService.saveOrder_detail(order_detail);
    }


    @GetMapping("/lists")
    public List<Order_detail> findAllOrder_details(){
        return order_detailService.getOrder_details();
    }

    @GetMapping("/order_details/{order_id}")
    public Order_detail findOrder_detailById(@PathVariable int order_id){
        return (Order_detail) order_detailService.getOrder_detailById(order_id);
    }


    @PutMapping("/update")
    public Order_detail updateOrder_detail(@RequestBody Order_detail order_detail){
        return  order_detailService.updateOrder_detail(order_detail);
    }

    @DeleteMapping("/delete/{order_id}")
    public String deleteOrder_detail( @PathVariable int order_id){
        return order_detailService.deleteOrder_detail(order_id);
    }


}
