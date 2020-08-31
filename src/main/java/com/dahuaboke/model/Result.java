package com.dahuaboke.model;

import com.dahuaboke.code.ResultCode;

/**
 * @Author dingwq
 * @Date 2020/8/31 10:49
 * @Description
 */
public class Result<T> {

    private ResultCode code;    //状态码
    private Boolean success;    //成功状态
    private String message;     //附带信息
    private Object obj;         //参数

    public Result() {
    }

    public Result(Boolean success) {
        this.success = success;
    }

    public Result(Boolean success, Object obj) {
        this.success = success;
        this.obj = obj;
    }

    public Result(ResultCode code, Boolean success) {
        this.code = code;
        this.success = success;
    }

    public Result(ResultCode code, Boolean success, Object obj) {
        this.code = code;
        this.success = success;
        this.obj = obj;
    }

    public Result(ResultCode code, Boolean success, String message, Object obj) {
        this.code = code;
        this.success = success;
        this.message = message;
        this.obj = obj;
    }

    public ResultCode getCode() {
        return code;
    }

    public void setCode(ResultCode code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static Result success() {
        return new Result(true);
    }

    public static Result success(ResultCode code) {
        return new Result(code, true);
    }

    public static Result success(ResultCode code, Object obj) {
        return new Result(code, true, obj);
    }

    public static Result success(ResultCode code, String message, Object obj) {
        return new Result(code, true, message, obj);
    }

    public static Result fail() {
        return new Result(false);
    }

    public static Result fail(ResultCode code) {
        return new Result(code, false);
    }

    public static Result fail(ResultCode code, Object obj) {
        return new Result(code, false, obj);
    }

    public static Result fail(ResultCode code, String message, Object obj) {
        return new Result(code, false, message, obj);
    }

}

