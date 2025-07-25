package com.project.shop.model.mapper;


import com.project.shop.model.dto.OrderDto;
import com.project.shop.model.entity.dataModel.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toDto(Order entity);
    Order toEntity(OrderDto dto);
}
