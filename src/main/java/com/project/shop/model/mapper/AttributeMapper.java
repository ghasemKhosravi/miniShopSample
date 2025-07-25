package com.project.shop.model.mapper;

import com.project.shop.model.dto.AddressDto;
import com.project.shop.model.dto.AttributeDto;
import com.project.shop.model.entity.dataModel.Address;
import com.project.shop.model.entity.dataModel.Attribute;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AttributeMapper {
    AttributeDto toDto(Attribute entity);
    Attribute toEntity(AttributeDto dto);
}
