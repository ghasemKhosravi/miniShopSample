package com.project.shop.model.dto;

import com.project.shop.model.entity.dataModel.AttrValue;
import com.project.shop.model.entity.dataModel.Category;
import com.project.shop.model.entity.dataModel.OrderDetail;
import com.project.shop.model.entity.embeded.CreationDelete;
import com.project.shop.model.entity.enums.IsActive;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Integer id;
    private CategoryDto category;
    private String name;
    private String pcode;
    private Integer quantity;
    private BigDecimal price;
    private IsActive isActive;
    private String description;
    private List<AttrValueDto> attrValues;
}
