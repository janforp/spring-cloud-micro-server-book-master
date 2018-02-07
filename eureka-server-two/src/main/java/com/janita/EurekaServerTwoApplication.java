package com.janita;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Janita on 2018/2/7 0007
 * 该类是：
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerTwoApplication {
    public static void main(String[] args) {
//        SpringApplication.run(EurekaServerApplication.class, args);
        new SpringApplicationBuilder(EurekaServerTwoApplication.class).web(true).run(args);
    }
}

