package com.ptm.demoqlbh.controller;

import com.ptm.demoqlbh.model.OrderDetail;
import com.ptm.demoqlbh.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/order-details")
public class OrderDetailController {


    private final OrderDetailService orderDetailService;

    @PostMapping
    public OrderDetail addOrderDetail(@RequestBody OrderDetail orderDetail){
        return orderDetailService.save(orderDetail);
    }


    @GetMapping
    public List<OrderDetail> findAll(){
      return orderDetailService.findAll();
    }

    @GetMapping("/{orderId}")
    public OrderDetail findById(@PathVariable int orderId){
        return orderDetailService.findById(orderId);
    }


    @PutMapping("/{orderId}")
    public OrderDetail update(@RequestBody OrderDetail orderDetail){
        return orderDetailService.update(orderDetail);
    }

    @DeleteMapping("/{orderId}")
    public String delete( @PathVariable int orderId){
       orderDetailService.delete(orderId);
       return "Deleted Order Detail";
    }


}
