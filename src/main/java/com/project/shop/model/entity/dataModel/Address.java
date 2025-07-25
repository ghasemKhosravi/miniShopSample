package com.project.shop.model.entity.dataModel;

import com.project.shop.model.entity.embeded.Creation;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String address;
    private String zipcode;
    private Float lat;
    private Float lng;
    @Embedded
    private Creation creation;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
