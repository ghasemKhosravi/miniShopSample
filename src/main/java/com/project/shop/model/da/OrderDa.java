package com.project.shop.model.da;

import com.project.shop.model.entity.dataModel.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDa extends JpaRepository<Order,Integer> {
}
