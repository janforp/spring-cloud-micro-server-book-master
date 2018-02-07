package com.janita.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Janita on 2018/2/6- 21:04
 * 该类是:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OneApplication {
    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }
}
