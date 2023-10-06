package com.jingdianjichi.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jingdianjichi.user.entity.po.UserPo;
import org.springframework.stereotype.Repository;

//usermapper 在继承了basemapper之后可以直接使用crud
@Repository
public interface UserMapper extends BaseMapper<UserPo> {

    IPage<UserPo> getUserPage(IPage<UserPo> userPoIPage);
}
