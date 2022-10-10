package com.example.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author jiang
 * @Date 2022/10/10 10:09
 **/
@RestController
public class TestController1 {

    @GetMapping("/test")
    public void test(){
        System.out.println("dddd");
    }
}
