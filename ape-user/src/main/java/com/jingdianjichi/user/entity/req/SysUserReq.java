package com.jingdianjichi.user.entity.req;

import com.jingdianjichi.bean.PageRequest;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2023-10-09 11:14:16
 */
@Data
public class SysUserReq extends PageRequest implements Serializable {
    private static final long serialVersionUID = 320603764421046108L;

    private Long id;

    private String name;

    private Integer age;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Integer deleteFlag;

    private Integer version;



}

