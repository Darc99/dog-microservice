package com.darc.dogmicros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DogMicrosApplication {

    public static void main(String[] args) {
        SpringApplication.run(DogMicrosApplication.class, args);
    }

}
