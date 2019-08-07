package com.fishing;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String args[]){
        ApplicationContext context = SpringApplication.run(ConfigServerApplication.class);


    }
}
