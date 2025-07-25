package com.project.shop.model.mapper;


import com.project.shop.model.dto.UserDto;
import com.project.shop.model.entity.dataModel.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {AddressMapper.class, RoleMapper.class})
public interface UserMapper {
    UserDto toDto(User entity);
    User toEntity(UserDto dto);
}
