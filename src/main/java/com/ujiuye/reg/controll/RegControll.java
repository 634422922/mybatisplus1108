package com.ujiuye.reg.controll;

import com.ujiuye.bean.Regist;
import com.ujiuye.reg.service.RegService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class RegControll {
    @Resource
    private RegService regService;
    @RequestMapping("insert")
    public String insert (Regist regist){
        boolean flag=regService.insert(regist);
        if(flag==true){
            return "show";
        }else {
            return "index";}

    }

}
