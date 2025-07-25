package com.project.shop.model.dto;

import com.project.shop.model.entity.dataModel.Attribute;
import com.project.shop.model.entity.dataModel.Category;
import com.project.shop.model.entity.dataModel.Product;
import com.project.shop.model.entity.embeded.CreationDelete;
import com.project.shop.model.entity.enums.IsActive;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private Integer id;
    private CategoryDto category;
    private List<CategoryDto> categories;
    private String name;
    private Boolean hasChild;
    private Integer depth;
    private IsActive isActive;
    private CreationDelete creationDelete;
    private List<AttributeDto> attributes;
}
