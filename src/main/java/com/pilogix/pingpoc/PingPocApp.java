package com.pilogix.pingpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PingPocApp {

    static ConfigurableApplicationContext context = null;

    public static void main(String[] args) {

        context = SpringApplication.run(PingPocApp.class, args);
    }
}