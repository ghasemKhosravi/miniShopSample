package com.project.shop.model.dto;


import com.project.shop.model.entity.embeded.Title;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {
    private Integer id;
    private Title title;
    private List<PermissionDto> permissions;
}
