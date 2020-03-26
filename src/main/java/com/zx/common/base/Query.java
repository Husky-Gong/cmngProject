package com.zx.common.base;

/**
 * 公司：武汉尚学堂
 * 作者：Mr.T
 * 类名：Query
 * 描述: 所有query 层的类的  基类
 * 时间：2020-03-20
 */
public class Query {
    /**
     * 页码
     */
    private Integer page = 1;
    /**
     *  每页条数
     */
    private Integer limit = 10;


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
