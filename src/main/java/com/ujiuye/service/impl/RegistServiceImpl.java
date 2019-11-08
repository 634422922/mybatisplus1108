package com.ujiuye.service.impl;

import com.ujiuye.bean.Regist;
import com.ujiuye.mapper.RegistMapper;
import com.ujiuye.service.RegistService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangjiandong
 * @since 2019-11-04
 */
@Service
public class RegistServiceImpl extends ServiceImpl<RegistMapper, Regist> implements RegistService {
    @Resource
    private RegistMapper registMapper;

    @Override
    public List<Regist> getInfo() {
        return registMapper.selectList(null);
    }

    @Override
    public int insert(Regist reg) {
        return registMapper.insert(reg);
    }

    @Override
    public boolean add(Regist reg) {
      return   registMapper.add(reg)>0;

    }
}