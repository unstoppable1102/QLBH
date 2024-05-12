package com.ptm.demoqlbh.service;

import com.ptm.demoqlbh.model.OrderDetail;
import com.ptm.demoqlbh.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {

    @Autowired
    private OrderDetailRepository order_detailRepository;

    public OrderDetail saveOrder_detail(OrderDetail order_detail) {
        return order_detailRepository.save(order_detail);
    }


    public List<OrderDetail> getOrder_details() {
        return order_detailRepository.findAll();
    }

    public List<OrderDetail> getOrder_detailById(int order_id) {
        return (List<OrderDetail>) order_detailRepository.findById(order_id).orElse(null);
    }


    public String deleteOrder_detail(int order_id) {
        order_detailRepository.deleteById(order_id);
        return "order_detail removed" + order_id;
    }

    public OrderDetail updateOrder_detail(OrderDetail order_detail) {
        OrderDetail existingOrder_detail = order_detailRepository.findById(order_detail.getId()).orElse(null);

        assert existingOrder_detail != null;
        existingOrder_detail.setProductId(order_detail.getProductId());

        existingOrder_detail.setQuantity(order_detail.getQuantity());

        existingOrder_detail.setPrice(order_detail.getPrice());


        return order_detailRepository.save(existingOrder_detail);
    }

}
