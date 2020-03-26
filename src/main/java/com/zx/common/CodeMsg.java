package com.zx.common;

/**
 * 公司：武汉尚学堂
 * 作者：Mr.T
 * 类名：CodeMsg
 * 描述:  业务码码和业务消息
 * 时间：2020-03-20
 */
public enum  CodeMsg {

    SUCCESS(200,"操作成功!"),
    //400  表示问题   00 表示 系统模块  100 表示对应模的错误的编码
    SERVER_ERROR(40000110,"程序员送外卖了");


   public Integer CODE;

   public String MSG;

    CodeMsg(Integer code, String msg){
        this.CODE = code;
        this.MSG = msg;
    }

}
