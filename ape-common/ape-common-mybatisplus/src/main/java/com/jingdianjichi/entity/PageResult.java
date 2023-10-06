package com.jingdianjichi.entity;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

//分页查询 就是在数据量很大的情况下 将数据按个数分页查看
// 对项目在做一个统一 统一分页格式的一个data
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

