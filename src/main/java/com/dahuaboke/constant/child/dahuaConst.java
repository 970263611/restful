package com.dahuaboke.constant.child;

import com.dahuaboke.constant.defaultConst;

/**
 * @Author dingwq
 * @Date 2020/8/31 11:18
 * @Description 大花博客常量类，建议不同类型创建不同的类
 */
public class dahuaConst extends defaultConst {

    private final static String TOP_CODE = FIRST + SECOND;

    /**
     * 根据不同业务生成不同状态码
     */

    //成功
    public final static String SUCCESS = TOP_CODE + "000";
    //失败
    public final static String FAIL = TOP_CODE + "999";

}
