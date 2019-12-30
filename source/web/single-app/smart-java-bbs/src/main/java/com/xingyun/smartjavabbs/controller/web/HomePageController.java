package com.xingyun.smartjavabbs.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2019/12/29 11:33
 */
@Controller
public class HomePageController {

    @GetMapping(value = "/")
    public String homePage(){
        return "index";
    }
}
