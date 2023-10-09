package com.jingdianjichi.user.service;

import com.jingdianjichi.entity.PageResult;
import com.jingdianjichi.user.entity.dto.UserDto;
import com.jingdianjichi.user.entity.po.UserPo;

//承接关于用户服务的方法 在imp中实现
//service层叫业务逻辑层，存放业务逻辑处理，不直接对数据库进行操作，有接口和接口实现类，提供controller层调用的方法。
//创建两个文件，一个存放接口类，一个存放接口实现类。
public interface UserService {

    int addUser(UserDto userDto);

    int delete(Integer id);

    PageResult<UserPo> getUserPage(UserDto userDto);
}
