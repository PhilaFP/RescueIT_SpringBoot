package com.RescueIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class Io2ProjectApplication extends SpringBootServletInitializer {

    public static void main(final String[] args) {
        SpringApplication.run(Io2ProjectApplication.class, args);
    }

    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(Io2ProjectApplication.class);
    }
}




