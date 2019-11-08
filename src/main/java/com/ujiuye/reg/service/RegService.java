package com.ujiuye.reg.service;

import com.ujiuye.bean.Regist;
import org.springframework.stereotype.Service;

@Service
public interface RegService {
    boolean insert(Regist regist);
}
