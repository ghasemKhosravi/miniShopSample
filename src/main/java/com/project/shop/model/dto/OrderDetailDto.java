package com.project.shop.model.dto;

import com.project.shop.model.entity.dataModel.Order;
import com.project.shop.model.entity.dataModel.Product;
import com.project.shop.model.entity.embeded.CreationDelete;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDto {
    private Integer id;
    private ProductDto product;
    private BigDecimal price;
    private BigDecimal takhfif;
    private Integer darsad_takhfif;
    private Integer quantity;
    private String ref_num;
    private String dargahname;
}
