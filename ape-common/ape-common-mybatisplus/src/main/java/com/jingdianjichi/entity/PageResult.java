package com.jingdianjichi.entity;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

//分页查询 就是在数据量很大的情况下 将数据按个数分页查看
// 对项目在做一个统一 统一分页格式的一个data
//分页查询 大致流程就是 将分页的index 和 size 从前端获取  获取方式就是通过监听get 得到前端发来的userListReq信息 然后复制属性到dto上 因为dto是与数据库交流的
//然后再用 select进行查询 select 映射到 getusermap上了
//之后把结果传到result中
//最后把result 放出来
//通过Result中的方法 集成好成功失败语句之类的 return给前端
@Data
public class PageResult<T> implements Serializable {
    private Long total; //总记录数
    private Long size; //每页的记录数
    private Long current; //当前的页数
    private Long pages; // 总页数
    private List<T> records = Collections.emptyList();//分页的一些参数
    public void loadData(IPage<T> pageData) {
        this.setCurrent(pageData.getCurrent());
        this.setPages(pageData.getPages());
        this.setSize(pageData.getSize());
        this.setTotal(pageData.getTotal());
        this.setRecords(pageData.getRecords());
    }
}

