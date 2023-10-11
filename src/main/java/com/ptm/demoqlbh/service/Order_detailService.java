package com.ptm.demoqlbh.service;

import com.ptm.demoqlbh.model.Category;
import com.ptm.demoqlbh.model.Order_detail;
import com.ptm.demoqlbh.repository.IOrder_detailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_detailService {

    @Autowired
    private IOrder_detailRepository order_detailRepository;

    public Order_detail saveOrder_detail(Order_detail order_detail) {
        return order_detailRepository.save(order_detail);
    }


    public List<Order_detail> getOrder_details() {
        return order_detailRepository.findAll();
    }

    public List<Order_detail> getOrder_detailById(int order_id) {
        return (List<Order_detail>) order_detailRepository.findById(order_id).orElse(null);
    }


    public String deleteOrder_detail(int order_id) {
        order_detailRepository.deleteById(order_id);
        return "order_detail removed" + order_id;
    }

    public Order_detail updateOrder_detail(Order_detail order_detail) {
        Order_detail existingOrder_detail = order_detailRepository.findById(order_detail.getId()).orElse(null);

        existingOrder_detail.setProduct_id(order_detail.getProduct_id());

        existingOrder_detail.setQuantity(order_detail.getQuantity());

        existingOrder_detail.setPrice(order_detail.getPrice());


        return order_detailRepository.save(existingOrder_detail);
    }

}
