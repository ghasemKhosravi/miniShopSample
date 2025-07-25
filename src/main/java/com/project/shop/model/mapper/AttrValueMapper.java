package com.project.shop.model.mapper;

import com.project.shop.model.dto.AttrValueDto;
import com.project.shop.model.dto.AttributeDto;
import com.project.shop.model.entity.dataModel.AttrValue;
import com.project.shop.model.entity.dataModel.Attribute;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AttrValueMapper {
    AttrValueDto toDto(AttrValue entity);
    AttrValue toEntity(AttrValueDto dto);
}
