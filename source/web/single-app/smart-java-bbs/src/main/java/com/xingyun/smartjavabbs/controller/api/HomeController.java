package com.xingyun.smartjavabbs.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qing-feng.zhao
 * @description
 * @date 2019/12/29 10:30
 */
@RestController
public class HomeController {

    @GetMapping(value = "/hello.do")
    public String home(){
        return "Hello World,Smart Java BBS";
    }
}
