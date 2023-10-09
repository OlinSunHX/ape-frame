package com.jingdianjichi.user.controller;

import com.jingdianjichi.bean.Result;
import com.jingdianjichi.user.entity.SysUser;
import com.jingdianjichi.user.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysUser)表控制层
 *
 * @author makejava
 * @since 2023-10-09 11:14:09
 */
@RestController
@RequestMapping("sysUser")
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    /**
     * 分页查询
     *
     * @param sysUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public Result<Page<SysUser>> queryByPage(SysUser sysUser, PageRequest pageRequest) {
        return Result.ok(this.sysUserService.queryByPage(sysUser, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public Result<SysUser> queryById(@PathVariable("id") Long id) {
        return Result.ok(this.sysUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param sysUser 实体
     * @return 新增结果
     */
    @PostMapping
    public Result<SysUser> add(SysUser sysUser) {
        return Result.ok(this.sysUserService.insert(sysUser));
    }

    /**
     * 编辑数据
     *
     * @param sysUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public Result<SysUser> edit(SysUser sysUser) {
        return Result.ok(this.sysUserService.update(sysUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public Result<Boolean> deleteById( id) {
        return Result.ok(this.sysUserService.deleteById(id));
    }

}

