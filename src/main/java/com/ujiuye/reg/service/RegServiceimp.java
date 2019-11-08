package com.ujiuye.reg.service;

import com.ujiuye.bean.Regist;
import com.ujiuye.reg.mapper.RegMapper;

import javax.annotation.Resource;

public class RegServiceimp implements RegService {
    @Resource
    private RegMapper regMapper;
    @Override
    public boolean insert(Regist regist) {
        return regMapper.insert(regist)>0;
    }
}
