package com.zx.common.base.service;

import com.zx.common.Result;

public interface IBaseService<Q,F> {
    /**
     * 根据ID 查询数据
     * @param id
     * @return
     */
    Result query(Integer id);

    /**
     *  根据条件分页查询数据
     * @param query
     * @return
     */
    Result queryPage(Q query);

    /**
     *  新增数据
     * @param form
     * @return
     */
    Result add(F form);

    /**
     *  更新数据
     * @param form
     * @return
     */
    Result update(F form);

    /**
     * 删除数据
     * @param id
     * @return
     */
    Result delete(Integer id);




}
