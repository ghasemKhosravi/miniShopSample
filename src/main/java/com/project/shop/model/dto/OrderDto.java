package com.project.shop.model.dto;

import com.project.shop.model.entity.dataModel.OrderDetail;
import com.project.shop.model.entity.dataModel.User;
import com.project.shop.model.entity.embeded.CreationDelete;
import com.project.shop.model.entity.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private Integer id;
    private UserDto user;
    private String orderNumber;
    private String description;
    private OrderStatus orderStatus;
    private BigDecimal total;
    private Set<OrderDetailDto> orderDetails;
}
