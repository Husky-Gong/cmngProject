package com.zx.common;

/**
 * 公司：武汉尚学堂
 * 作者：Mr.T
 * 类名：Result
 * 描述:  业务结果类
 * 时间：2020-03-20
 */
public class Result {
    /**
     * 业务编码
     */
    private Integer code;
    /**
     * 业务消息
     */
    private String msg;
    /**
     *  业务数据
     */
    private Object data;

    public Result(){
        this.code = CodeMsg.SUCCESS.CODE;
        this.msg = CodeMsg.SUCCESS.MSG;
    }

    public Result(Object data){
        this();
        this.data = data;
    }

    public Result(CodeMsg codeMsg){
        this.code = codeMsg.CODE;
        this.msg = codeMsg.MSG;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
