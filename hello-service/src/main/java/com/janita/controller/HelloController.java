package com.janita.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2018/2/6- 21:05
 * 该类是:
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired(required = false)
    private DiscoveryClient client;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host: " + instance.getHost() + ", service_id: " + instance.getServiceId());
        return port;
    }
}
