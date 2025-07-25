package com.project.shop.model.dto;

import com.project.shop.model.entity.dataModel.Role;
import com.project.shop.model.entity.embeded.Creation;
import com.project.shop.model.entity.embeded.Title;
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
public class PermissionDto {
    private Integer id;
    private Title title;
}
