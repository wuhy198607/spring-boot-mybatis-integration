package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"app-db.xml"})
public class SpringMybatisSampleApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(SpringMybatisSampleApplication.class, args);
    }
}
