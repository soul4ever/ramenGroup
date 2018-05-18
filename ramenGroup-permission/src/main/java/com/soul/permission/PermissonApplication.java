package com.soul.permission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2018/5/18.
 */
@SpringBootApplication
public class PermissonApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(PermissonApplication.class);
        app.run(args);
    }

}
