package com.example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource(value = {"classpath:application.properties"}, encoding = "utf-8")
@ConfigurationProperties(prefix = "persion")
@Data
public class Persion
{
    private String name;
    private int age;
}
