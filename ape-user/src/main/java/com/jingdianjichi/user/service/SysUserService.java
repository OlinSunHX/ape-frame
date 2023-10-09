package com.jingdianjichi.user.service;

import com.jingdianjichi.bean.PageResponse;
import com.jingdianjichi.user.entity.po.SysUser;
import com.jingdianjichi.user.entity.req.SysUserReq;

//代码生成器部分的逻辑
//首先用easycode生成代码模版
//根据我们用的mybatis对代码进行修改
//通过pageno 和 pagesize 得到有关页数的相关信息
//自己封装起需要返回给前端的response
//用之前写好的与前端交流的result部分 将结果打印出来

/**
 * (SysUser)表服务接口
 *
 * @author makejava
 * @since 2023-10-09 11:14:16
 */
public interface SysUserService {

    /**
     * 通过ID查询单条数据
     *

     * @param id
     * @return 实例对象
     */
    SysUser queryById(Long id);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    PageResponse<SysUser> queryByPage(SysUserReq sysUserReq);

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser insert(SysUser sysUser);

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser update(SysUser sysUser);

    /**
     * 通过主键删除数据
     *
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
