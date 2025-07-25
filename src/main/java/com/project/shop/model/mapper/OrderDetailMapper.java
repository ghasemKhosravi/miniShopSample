package com.project.shop.model.mapper;

import com.project.shop.model.dto.CategoryDto;
import com.project.shop.model.dto.OrderDetailDto;
import com.project.shop.model.entity.dataModel.Category;
import com.project.shop.model.entity.dataModel.OrderDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderDetailMapper {
    OrderDetailDto toDto(OrderDetail entity);
    OrderDetail toEntity(OrderDetailDto dto);
}
