package com.ujiuye.mapper;

import com.ujiuye.bean.Regist;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangjiandong
 * @since 2019-11-04
 */
public interface RegistMapper extends BaseMapper<Regist> {

    int add(Regist reg);
}
