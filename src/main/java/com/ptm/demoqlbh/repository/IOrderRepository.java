package com.ptm.demoqlbh.repository;

import com.ptm.demoqlbh.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order, Integer> {

}
