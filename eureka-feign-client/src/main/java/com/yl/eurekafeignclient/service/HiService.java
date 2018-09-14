package com.yl.eurekafeignclient.service;

import com.yl.eurekafeignclient.feign.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Static
 * @date 2018/9/12 16:54
 */
@Service
public class HiService {
    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name) {
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}