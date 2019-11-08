package com.ujiuye.service;

import com.ujiuye.bean.Regist;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangjiandong
 * @since 2019-11-04
 */
public interface RegistService extends IService<Regist> {

    List<Regist> getInfo();

    int insert(Regist reg);



    boolean add(Regist reg);
}
