package com.jingdianjichi.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jingdianjichi.user.entity.po.UserPo;
import org.springframework.stereotype.Repository;

//dao层也叫mapper层，数据持久层
//对数据库进行持久化操作，他的方法是针对数据库操作的，基本用到的就是增删改查。它只是个接口，只有方法名字，具体实现在mapper.xml中。
//usermapper 在继承了basemapper之后可以直接使用crud
@Repository
public interface UserMapper extends BaseMapper<UserPo> {

    IPage<UserPo> getUserPage(IPage<UserPo> userPoIPage);
}
