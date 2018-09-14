package com.yl.eurekamonitorclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Static
 */
@SpringBootApplication
//@EnableEurekaClient
@EnableHystrixDashboard
@EnableTurbine
public class EurekaMonitorClientApplication {
//    @Bean
//    public ServletRegistrationBean servletRegistration() {
//        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(streamServlet);
//        servletRegistrationBean.setLoadOnStartup(1);
//        servletRegistrationBean.addUrlMappings("/hystrix.stream");
//        servletRegistrationBean.setName("HystrixMetricsStreamServlet");
//        return servletRegistrationBean;
//    }


    public static void main(String[] args) {
        SpringApplication.run(EurekaMonitorClientApplication.class, args);
    }
}