package com.hk700wang.nbaserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NBAServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NBAServiceProviderApplication.class, args);
    }

}
