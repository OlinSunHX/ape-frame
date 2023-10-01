package com.jingdianjichi.user.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jingdianjichi.user.entity.dto.UserDto;
import com.jingdianjichi.user.entity.po.UserPo;
import com.jingdianjichi.user.mapper.UserMapper;
import com.jingdianjichi.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    //实现类 实现service
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(UserDto userDto) {
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userDto,userPo);
        int count = userMapper.insert(userPo);
        return count;
    }

}
