package com.ascending.training;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ascending.training"})
public class ApplicationBootstrap {
    public static void main(String[] args){
        SpringBootApplication.run(ApplicationBootstrap.class,args);
    }
}
