package com.indrave.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyj
 * @date 2020/7/3
 * @description
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Greeting from Spirng Boot!";
    }

}
