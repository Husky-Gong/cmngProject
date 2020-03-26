package com.zx.sys.service.impl;

import com.zx.common.base.service.impl.BaseServiceImpl;
import com.zx.sys.mapper.SysCompanyMapper;
import com.zx.sys.service.ISysCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysCompanyServiceImpl extends BaseServiceImpl implements ISysCompanyService {

    @Autowired
    private SysCompanyMapper companyMapper;

    public SysCompanyServiceImpl(SysCompanyMapper companyMapper) {
        super(companyMapper);
    }
}
