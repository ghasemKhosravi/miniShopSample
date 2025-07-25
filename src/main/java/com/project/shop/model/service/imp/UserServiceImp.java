package com.project.shop.model.service.imp;

import com.project.shop.model.da.RoleDa;
import com.project.shop.model.da.UserDa;
import com.project.shop.model.dto.RoleDto;
import com.project.shop.model.dto.UserDto;
import com.project.shop.model.entity.dataModel.Role;
import com.project.shop.model.entity.dataModel.User;
import com.project.shop.model.mapper.UserMapper;
import com.project.shop.model.service.contract.UserService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImp implements UserService {
    @Autowired
    private UserDa userDa;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleDa roleDa;


    @Override
    public UserDto save(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        if(userDto.getRoles() != null)
        {
            Set<Role> roles = userDto.getRoles().stream()
                    .map(roleDto -> roleDa.findById(roleDto.getId())
                    .orElseThrow(()-> new EntityNotFoundException("role not found")))
                    .collect(Collectors.toSet());
            user.setRoles(roles);
        }
       return userMapper.toDto(userDa.save(user));
    }

    @Override
    public UserDto findById(Integer id) {
        User user = userDa.findById(id).orElseThrow(()->new EntityNotFoundException("user not found"));
        UserDto userDto =userMapper.toDto(user);
        return userDto;
    }

    @Override
    public List<UserDto> getAll() {
        return List.of();
    }

    @Override
    public UserDto update(Integer id, UserDto newUser) {
        return null;
    }

    @Override
    public boolean deleteUser(Integer id) {
        return false;
    }
}
