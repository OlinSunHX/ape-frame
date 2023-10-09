package com.jingdianjichi.user.dao;

import com.jingdianjichi.user.entity.po.SysUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (SysUser)表数据库访问层
 *
 * @author makejava
 * @since 2023-10-09 11:14:09
 */
public interface SysUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @return 实例对象
     */
    SysUser queryById( );

    /**
     * 查询指定行数据
     *
     * @param sysUser 查询条件
     * @return 对象列表
     */
    // @Param的作用就是给参数命名，比如在mapper里面某方法A（int id），当添加注解后A（@Param("userId") int id），也就是说外部想要取出传入的id值，只需要取它的参数名userId就可以了。
    // 将参数值传如SQL语句中，通过#{userId}进行取值给SQL的参数赋值。

    List<SysUser> queryAllByLimit(@Param("po") SysUser sysUser, @Param("pageStart") Long pageStart, @Param("pageSize") Long pageSize);

    /**
     * 统计总行数
     *
     * @param sysUser 查询条件
     * @return 总行数
     */
    long count(SysUser sysUser);

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 影响行数
     */
    int insert(SysUser sysUser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysUser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysUser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysUser> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SysUser> entities);

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 影响行数
     */
    int update(SysUser sysUser);

    /**
     * 通过主键删除数据
     *
     * @return 影响行数
     */
    int deleteById( );

}

