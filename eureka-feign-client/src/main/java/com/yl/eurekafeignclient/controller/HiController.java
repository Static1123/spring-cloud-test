package com.yl.eurekafeignclient.controller;

import com.yl.eurekafeignclient.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Static
 * @date 2018/9/12 16:55
 */
@RestController
public class HiController {
    @Autowired
    private HiService hiService;

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name", defaultValue = "Static", required = false) String name) {
        return hiService.sayHi(name);
    }
}
