package com.project.shop.model.entity.dataModel;

import com.project.shop.model.entity.embeded.CreationDelete;
import com.project.shop.model.entity.enums.IsActive;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private String name;
    private String pcode;
    private Integer quantity;
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    private IsActive isActive;
    private String description;
    @Embedded
    private CreationDelete creationDelete;

    @OneToMany(mappedBy = "product")
    private List<AttrValue> attrValues;

    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;
}
