package com.dahuaboke.code;

import com.dahuaboke.constant.DAHUABOKE;
import com.dahuaboke.model.Code;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * @Author dingwq
 * @Date 2020/8/31 11:05
 * @Description
 */
public enum ResultCode {

    /**
     * 可以继续添加自定义状态
     * 也可以根据应用划分不同前缀
     */
    success(new Code(DAHUABOKE.SUCCESS)),
    fail(new Code(DAHUABOKE.FAIL));

    public Code code;

    ResultCode(Code code) {
        this.code = code;
    }
}
