package com.example.cloudstarternetflixeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudStarterNetflixEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudStarterNetflixEurekaServerApplication.class, args);
    }

}
