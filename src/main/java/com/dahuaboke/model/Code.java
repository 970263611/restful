package com.dahuaboke.model;

import java.io.Serializable;

/**
 * @Author dingwq
 * @Date 2020/8/31 16:04
 * @Description
 */
public class Code implements Serializable {

    private String code;

    public Code(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
