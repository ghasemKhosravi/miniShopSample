package com.project.shop.model.dto;

import com.project.shop.model.entity.dataModel.AttrValue;
import com.project.shop.model.entity.dataModel.Category;
import com.project.shop.model.entity.embeded.CreationDelete;
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
public class AttributeDto {
    private Integer id;
    private String title;
}
