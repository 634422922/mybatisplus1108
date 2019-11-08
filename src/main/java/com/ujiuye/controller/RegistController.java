package com.ujiuye.controller;


import com.ujiuye.bean.Regist;
import com.ujiuye.service.RegistService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wangjiandong
 * @since 2019-11-04
 */
@Controller
@RequestMapping("/regist")
public class RegistController {
    @Resource
private RegistService registService;
@RequestMapping("showInfo")
public String showInfo(ModelMap modelMap)
    @RequestMapping("save")
    public  String  save(Regist reg){
//      int a = registService.insert(reg);


//       boolean flag=registService.add(reg);
//        if(flag){
//            return "show";
//        }else{return"index";}
       return "index";
    }

}

