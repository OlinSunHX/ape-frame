package com.jingdianjichi.user.service;

import com.jingdianjichi.user.entity.SysUser;

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
     * @param 主键
     * @param id
     * @return 实例对象
     */
    SysUser queryById(Long id);

    /**
     * 分页查询
     *
     * @param sysUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SysUser> queryByPage(SysUser sysUser, Integer pageNo, Integer pageSize);

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
     * @param  主键
     * @return 是否成功
     */
    boolean deleteById( );

}
