package com.jingdianjichi.user.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.jingdianjichi.bean.Result;
import com.jingdianjichi.user.entity.dto.UserDto;
import com.jingdianjichi.user.entity.req.UserListReq;
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
    public Result addUser(@RequestBody UserReq userReq){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userReq,userDto);
        return Result.ok(userService.addUser(userDto));
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        return Result.ok(userService.delete(id));
    }
//@RequestBody主要用来接收前端传递给后端的json字符串中的数据的
    @GetMapping()
    public Result getPage(@RequestBody UserListReq userListReq){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userListReq, userDto);
        return Result.ok(userService.getUserPage(userDto));
    }

}
