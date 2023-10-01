package com.jingdianjichi.user.controller;

import com.jingdianjichi.user.entity.dto.UserDto;
import com.jingdianjichi.user.entity.req.UserReq;
import com.jingdianjichi.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//新增就用post 用的时候要打上RequestBody才能有效
//查询就用get
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Integer addUser(@RequestBody UserReq userReq){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq,userDto);
        int i = userService.addUser(userDto);
        return i;
    }

}
