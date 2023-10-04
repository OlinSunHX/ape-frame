package com.jingdianjichi.user.entity.po;

import com.baomidou.mybatisplus.annotation.*;
import com.jingdianjichi.entity.BaseEntity;
import lombok.Data;

import java.util.Date;


//po 是与数据库进行交互的东西 service和mapper交互
@TableName("user")
@Data
public class UserPo extends BaseEntity {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;

}
