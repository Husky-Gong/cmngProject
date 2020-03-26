package com.zx.common.base.controller;

import com.zx.common.base.service.IBaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公司：武汉尚学堂
 * 作者：Mr.T
 * 类名：BaseController
 * 描述:
 * 时间：2020-03-20
 */
public class BaseController<Query,Form> {

    private IBaseService baseService;

    public BaseController(IBaseService baseService) {
        this.baseService = baseService;
    }

    @GetMapping("page.do")
    public Object page(Query query){
        return  baseService.queryPage(query);
    }

    @RequestMapping("add.do")
    public Object add(Form  form){

        return  baseService.add(form);
    }

    @RequestMapping("update.do")
    public Object update(Form  form){
        return  baseService.update(form);
    }

    @RequestMapping("delete.do")
    public Object delete(Integer id){
        return  baseService.delete(id);
    }

}
