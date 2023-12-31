package com.jingdianjichi.bean;

import lombok.Data;

import java.io.Serializable;
@Data
public class Result<T> implements Serializable {

    private Result() {
        //不让他实例化，只能使用我们提供的静态方法
    }
    private boolean success;
    private Integer code;
    private String message;
    private T data;//需要展示的data 不是到是啥 需要用泛型


    public static Result ok(){
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.SUCCESS);
        result.setMessage(ResultMessage.SUCCESS);
        return result;
    }

    public static Result ok(Integer resultCode, String resultMessage) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(resultCode);
        result.setMessage(resultMessage);
        return result;
    }

    public static <T> Result ok(Integer resultCode, String resultMessage, T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(resultCode);
        result.setMessage(resultMessage);
        result.setData(data);
        return result;
    }

    public static <T> Result ok(T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.SUCCESS);
        result.setMessage(ResultMessage.SUCCESS);
        result.setData(data);
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.ERROR);
        result.setMessage(ResultMessage.ERROR);
        return result;
    }

    public static Result fail(Integer resultCode, String resultMessage) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(resultCode);
        result.setMessage(resultMessage);
        return result;
    }

    public static <T> Result fail(Integer resultCode, String resultMessage, T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(resultCode);
        result.setMessage(resultMessage);
        result.setData(data);
        return result;
    }

    public static <T> Result fail(T data) {
        Result result = new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.ERROR);
        result.setMessage(ResultMessage.ERROR);
        result.setData(data);
        return result;
    }
}
