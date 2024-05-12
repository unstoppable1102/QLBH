package com.ptm.demoqlbh.repository;

import com.ptm.demoqlbh.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
}
