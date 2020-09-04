package com.dahuaboke.model;

/**
 * @Author dingwq
 * @Date 2020/8/31 10:49
 * @Description
 */
public class ResultModel {

    private Code result;        //状态码
    private Boolean success;    //成功状态
    private Object obj;         //参数

    public ResultModel() {
    }

    private ResultModel(Boolean success) {
        this.success = success;
    }

    private ResultModel(Boolean success, Object obj) {
        this.success = success;
        this.obj = obj;
    }

    private ResultModel(Code result, Boolean success) {
        this.result = result;
        this.success = success;
    }

    private ResultModel(Code result, Boolean success, Object obj) {
        this.result = result;
        this.success = success;
        this.obj = obj;
    }

    private ResultModel(Code result, Boolean success, String message, Object obj) {
        this.result = result;
        this.result.setMessage(message);
        this.success = success;
        this.obj = obj;
    }

    public Code getResult() {
        return result;
    }

    public void setResult(Code result) {
        this.result = result;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static ResultModel success() {
        return new ResultModel(true);
    }

    public static ResultModel success(Code result) {
        return new ResultModel(result, true);
    }

    public static ResultModel success(String message) {
        Code result = new Code();
        result.setMessage(message);
        return new ResultModel(result, true);
    }

    public static ResultModel success(Object obj) {
        return new ResultModel(true, obj);
    }

    public static ResultModel success(Code result, String message) {
        result.setMessage(message);
        return new ResultModel(result, true);
    }

    public static ResultModel success(Code result, Object obj) {
        return new ResultModel(result, true, obj);
    }

    public static ResultModel success(Code result, String message, Object obj) {
        return new ResultModel(result, true, message, obj);
    }

    public static ResultModel fail() {
        return new ResultModel(false);
    }

    public static ResultModel fail(String message) {
        Code result = new Code();
        result.setMessage(message);
        return new ResultModel(result, false);
    }

    public static ResultModel fail(Code result) {
        return new ResultModel(result, false);
    }

    public static ResultModel fail(Object obj) {
        return new ResultModel(false, obj);
    }

    public static ResultModel fail(Code result, String message) {
        result.setMessage(message);
        return new ResultModel(result, false);
    }

    public static ResultModel fail(Code result, Object obj) {
        return new ResultModel(result, false, obj);
    }

    public static ResultModel fail(Code result, String message, Object obj) {
        return new ResultModel(result, false, message, obj);
    }

    @Override
    public String toString() {
        return "Result{" +
                "result=" + result +
                ", success=" + success +
                ", obj=" + obj +
                '}';
    }
}

