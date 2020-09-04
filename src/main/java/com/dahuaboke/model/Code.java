package com.dahuaboke.model;

import java.io.Serializable;

/**
 * @Author dingwq
 * @Date 2020/8/31 16:04
 * @Description
 */
public class Code {

    private String code;
    private String message;

    public Code() {
        this.message = null;
    }

    public Code(String code) {
        this.code = code;
        this.message = null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
