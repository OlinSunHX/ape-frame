package com.jingdianjichi.bean;

import lombok.Setter;

//这个类专门用来接请求参数
//是前端给我们的东西
@Setter  //setter是一种更新变量值的方法
public class PageRequest {
    private Long pageNo = 1L;
    private Long pageSize = 10L;
    public Long getPageNo(){
        if (pageNo == null || pageNo < 1) {
            return 1L;
        }
        return pageNo;
    }
    public Long getPageSize(){
        if (pageSize == null || pageSize < 1 || pageSize > Integer.MAX_VALUE) {
            return 10L;
        }
        return pageSize;
    }
}
