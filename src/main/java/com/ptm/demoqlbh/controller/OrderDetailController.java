package com.ptm.demoqlbh.controller;

import com.ptm.demoqlbh.model.OrderDetail;
import com.ptm.demoqlbh.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order_detail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService order_detailService;

    @PostMapping("/add")
    public OrderDetail addOrder_detail(@RequestBody OrderDetail order_detail){
        return  order_detailService.saveOrder_detail(order_detail);
    }


    @GetMapping("/lists")
    public List<OrderDetail> findAllOrder_details(){
        return order_detailService.getOrder_details();
    }

    @GetMapping("/order_details/{order_id}")
    public OrderDetail findOrder_detailById(@PathVariable int order_id){
        return (OrderDetail) order_detailService.getOrder_detailById(order_id);
    }


    @PutMapping("/update")
    public OrderDetail updateOrder_detail(@RequestBody OrderDetail order_detail){
        return  order_detailService.updateOrder_detail(order_detail);
    }

    @DeleteMapping("/delete/{order_id}")
    public String deleteOrder_detail( @PathVariable int order_id){
        return order_detailService.deleteOrder_detail(order_id);
    }


}
