package com.jingdianjichi.common;

import com.jingdianjichi.bean.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// 模块化的好处就在于可以很方便的增加功能
// 在这里统一拦截异常
@RestControllerAdvice
public class ExceptAdaptController {
    @ExceptionHandler(RuntimeException.class)
    public Result runTimeException(RuntimeException exception){
        exception.printStackTrace();
        return Result.fail();
    }
    //遇到错误的时候 就可以在前端对异常进行printout

    @ExceptionHandler(Exception.class)
    public Result exception(Exception exception){
        exception.printStackTrace();
        return Result.fail();
    }
}
