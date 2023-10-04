package com.jingdianjichi.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;
//这段代码帮助我们来处理每次提交数据都需要new一些数据填进去太麻烦 用的是mybatisplus提供的MetaObjectHandler
@Component //这个注解可以帮我们把这个东西注入到spring中
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"createBy",String.class,"olin");
        this.strictInsertFill(metaObject,"createTime", Date.class,new Date());
        this.strictInsertFill(metaObject,"deleteFlag",Integer.class,0);
        this.strictInsertFill(metaObject,"version",Integer.class,0);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject,"updateBy",String.class,"olin");
        this.strictUpdateFill(metaObject,"updateTime", Date.class,new Date());
    }
}
