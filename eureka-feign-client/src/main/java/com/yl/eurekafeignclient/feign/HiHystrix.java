package com.yl.eurekafeignclient.feign;

import org.springframework.stereotype.Component;

/**
 * @author Static
 * @date 2018/9/12 18:13
 */
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "Hi," + name + ",sorry,error!";
    }
}