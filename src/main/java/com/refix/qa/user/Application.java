package com.refix.qa.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Genevieve on 2015-11-24.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        System.setProperty("server.contextPath", "/user-service");
        System.setProperty("server.port", "8081");

        SpringApplication.run(Application.class, args);

    }
}
