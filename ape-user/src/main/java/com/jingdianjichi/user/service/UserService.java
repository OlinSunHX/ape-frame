package com.jingdianjichi.user.service;

import com.jingdianjichi.user.entity.dto.UserDto;

//承接关于用户服务的方法 在imp中实现
public interface UserService {

    int addUser(UserDto userDto);

}
