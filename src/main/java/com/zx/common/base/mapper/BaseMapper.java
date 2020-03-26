package com.zx.common.base.mapper;

import java.util.List;

public interface BaseMapper<V,Q,F> {

    /**
     *  根据ID 查询数据
     * @param id
     * @return
     */
    V selectByPrimaryKey(Integer id);

    /**
     *  根据条件查询列表数据
     * @param query
     * @return
     */
    List<V> selectList(Q query);

    /**
     *  添加数据
     * @param record
     * @return
     */
    int insert(F record);

    /**
     * 更新数据
     * @param form
     * @return
     */
    int updateByPrimaryKey(F form);

    /**
     * 删除数据
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);




}
