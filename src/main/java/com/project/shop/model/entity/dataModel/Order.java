package com.project.shop.model.entity.dataModel;

import com.project.shop.model.entity.embeded.CreationDelete;
import com.project.shop.model.entity.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String orderNumber;
    private String description;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
    private BigDecimal total;
    @Embedded
    private CreationDelete creationDelete;
    @OneToMany
    private Set<OrderDetail> orderDetails;

}
