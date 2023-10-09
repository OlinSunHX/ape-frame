package com.jingdianjichi.user.service.impl;

import com.jingdianjichi.user.entity.SysUser;
import com.jingdianjichi.user.dao.SysUserDao;
import com.jingdianjichi.user.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (SysUser)表服务实现类
 *
 * @author makejava
 * @since 2023-10-09 11:14:16
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param 主键
     * @param id
     * @return 实例对象
     */
    @Override
    public SysUser queryById(Long id) {
        return this.sysUserDao.queryById();
    }

    /**
     * 分页查询
     *
     * @param sysUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SysUser> queryByPage(SysUser sysUser, Integer pageNo, Integer pageSize) {
        long total = this.sysUserDao.count(sysUser);
        return new PageImpl<>(this.sysUserDao.queryAllByLimit(sysUser, pageNo, pageSize));
    }

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser insert(SysUser sysUser) {
        this.sysUserDao.insert(sysUser);
        return sysUser;
    }

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysUser update(SysUser sysUser) {
        this.sysUserDao.update(sysUser);
        return this.queryById(sysUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param  主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById( ) {
        return this.sysUserDao.deleteById() > 0;
    }
}
