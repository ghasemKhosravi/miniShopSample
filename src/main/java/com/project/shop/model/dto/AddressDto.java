package com.project.shop.model.dto;

import com.project.shop.model.entity.dataModel.User;
import com.project.shop.model.entity.embeded.Creation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
    private Integer id;
    private String address;
    private String zipcode;
    private Float lat;
    private Float lng;
}
