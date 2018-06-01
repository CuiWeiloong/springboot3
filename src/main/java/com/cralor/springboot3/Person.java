package com.cralor.springboot3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by cc.
 * 2018/5/25 11:45
 **/
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String size;

    private String age;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
