package com.jingdianjichi.user.service;

import com.jingdianjichi.entity.PageResult;
import com.jingdianjichi.user.entity.dto.UserDto;
import com.jingdianjichi.user.entity.po.UserPo;

//承接关于用户服务的方法 在imp中实现
public interface UserService {

    int addUser(UserDto userDto);

    int delete(Integer id);

    PageResult<UserPo> getUserPage(UserDto userDto);
}
