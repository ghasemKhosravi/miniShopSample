package com.project.shop.model.entity.dataModel;

import com.project.shop.model.entity.embeded.CreationDelete;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orderdetials")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "prodouct_id")
    private Product product;
    private BigDecimal price;
    private BigDecimal takhfif;
    private Integer darsad_takhfif;
    private Integer quantity;
    private String ref_num;
    private String dargahname;
    @Embedded
    private CreationDelete creationDelete;

}
