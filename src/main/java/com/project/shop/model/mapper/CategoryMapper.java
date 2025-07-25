package com.project.shop.model.mapper;

import com.project.shop.model.dto.AttrValueDto;
import com.project.shop.model.dto.CategoryDto;
import com.project.shop.model.entity.dataModel.AttrValue;
import com.project.shop.model.entity.dataModel.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryDto toDto(Category entity);
    Category toEntity(CategoryDto dto);
}
