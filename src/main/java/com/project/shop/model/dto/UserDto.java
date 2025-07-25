package com.project.shop.model.dto;


import com.project.shop.model.entity.enums.IsActive;
import lombok.*;

import java.sql.Timestamp;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private Integer id;
    private String name;
    private String family;
    private String pass;
    private String ncode;
    private String username;
    private String phoneNumber;
    private String email;
    private IsActive isActive;
    private Timestamp lastLogin;
    private Set<AddressDto> address;
    private Set<RoleDto> roles;
}
