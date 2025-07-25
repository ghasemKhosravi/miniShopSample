package com.project.shop.controller;

import com.project.shop.model.dto.UserDto;
import com.project.shop.model.entity.dataModel.User;
import com.project.shop.model.service.contract.UserService;
import com.project.shop.utility.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public ApiResponse<UserDto> getUser(@PathVariable Integer id){
        return ApiResponse.<UserDto>builder().httpStatus(HttpStatus.OK).
                data(userService.findById(id)).build();

    }
    @PostMapping("/add")
    public ApiResponse<UserDto> addUser(@RequestBody UserDto userDto){
        return ApiResponse.<UserDto>builder().httpStatus(HttpStatus.OK).
                data(userService.save(userDto)).build();
    }
    @ExceptionHandler
    public ApiResponse<UserDto> userExpHandler(Exception e){
        return ApiResponse.<UserDto>builder().httpStatus(HttpStatus.NOT_FOUND).message(e.getMessage()).
                data(null).build();

    }

}
