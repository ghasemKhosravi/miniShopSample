package com.project.shop.model.dto;

import com.project.shop.model.entity.dataModel.Attribute;
import com.project.shop.model.entity.dataModel.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AttrValueDto {
    private Integer id;
    private String val;
    private AttributeDto attribute;
}
