package com.yl.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Static
 * @date 2018/9/12 10:07
 */
@RestController
public class HiController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/hi")
    public String hi(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }
}