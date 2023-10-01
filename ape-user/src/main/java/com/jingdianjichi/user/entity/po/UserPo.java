package com.jingdianjichi.user.entity.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;


//po 是与数据库进行交互的东西 service和mapper交互
@TableName("user")
@Data
public class UserPo {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;

    @TableField(fill = FieldFill.INSERT)
    private String createBy;


    @TableField(fill = FieldFill.INSERT)
    private Date createTime;


    @TableField(fill = FieldFill.UPDATE)
    private String updateBy;


    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    @TableField(fill = FieldFill.INSERT)
    private Integer deleteFlag;

    @TableField(fill = FieldFill.INSERT)
    private Integer version;

}
