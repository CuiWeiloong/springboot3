package com.cralor.springboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Springboot3Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3Application.class, args);
    }

    /**
     * 打war包，在tomcat下运行
     * @param builder
     * @return
     */
  /*  @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Springboot3Application.class);
    }*/
}