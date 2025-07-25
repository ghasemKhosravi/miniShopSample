package com.project.shop.model.service.contract;

import com.project.shop.model.dto.UserDto;


import java.util.List;

public interface UserService {
    UserDto save(UserDto userDto);
    UserDto findById(Integer id);
    List<UserDto> getAll();
    UserDto update(Integer id,UserDto newuserDto);
    boolean deleteUser(Integer id);
}
