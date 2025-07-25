package com.project.shop.model.mapper;

import com.project.shop.model.dto.PermissionDto;
import com.project.shop.model.entity.dataModel.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {RoleMapper.class})
public interface PermissionMapper {
    PermissionDto toDto(Permission permission);
    Permission toEntity(PermissionDto dto);

}
