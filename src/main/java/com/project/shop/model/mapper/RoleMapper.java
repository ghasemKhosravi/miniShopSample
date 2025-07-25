package com.project.shop.model.mapper;

import com.project.shop.model.dto.OrderDto;
import com.project.shop.model.dto.RoleDto;
import com.project.shop.model.entity.dataModel.Order;
import com.project.shop.model.entity.dataModel.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {PermissionMapper.class})
public interface RoleMapper {
    RoleDto toDto(Role entity);
    Role toEntity(RoleDto dto);
}
