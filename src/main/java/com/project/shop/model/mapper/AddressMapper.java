package com.project.shop.model.mapper;

import com.project.shop.model.dto.AddressDto;
import com.project.shop.model.dto.PermissionDto;
import com.project.shop.model.entity.dataModel.Address;
import com.project.shop.model.entity.dataModel.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    AddressDto toDto(Address entity);
    Address toEntity(AddressDto dto);
}
