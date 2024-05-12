package com.ptm.demoqlbh.service;

import com.ptm.demoqlbh.model.Order;
import com.ptm.demoqlbh.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }


    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public List<Order> getOrderById(int id) {
        return (List<Order>) orderRepository.findById(id).orElse(null);
    }

    public String deleteOrder(int id) {
        orderRepository.deleteById(id);
        return "Order removed" + id;
    }

    public Order updateOrder(Order order) {
        Order existingOrder = orderRepository.findById(order.getId()).orElse(null);

        existingOrder.setCustomer_id(order.getCustomer_id());

        existingOrder.setStatus(order.getStatus());

        existingOrder.setOrder_date(order.getOrder_date());

        return orderRepository.save(existingOrder);
    }

}
