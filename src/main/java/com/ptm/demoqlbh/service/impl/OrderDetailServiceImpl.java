package com.ptm.demoqlbh.service.impl;

import com.ptm.demoqlbh.model.OrderDetail;
import com.ptm.demoqlbh.repository.OrderDetailRepository;
import com.ptm.demoqlbh.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService {

    private final OrderDetailRepository orderDetailRepository;


    @Override
    public OrderDetail findById(Integer id) {
        return orderDetailRepository.findById(id).orElseThrow(()-> new RuntimeException("OrderDetail not found"));
    }

    @Override
    public List<OrderDetail> findAll() {
        return orderDetailRepository.findAll();
    }

    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public OrderDetail update(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public void delete(Integer id) {
        orderDetailRepository.deleteById(id);
    }
}
