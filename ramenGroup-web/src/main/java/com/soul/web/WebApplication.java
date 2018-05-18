package com.soul.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2018/5/18.
 */
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) throws IOException {
//        Properties properties = new Properties();
        SpringApplication app = new SpringApplication(WebApplication.class);
        app.run(args);
    }

}
