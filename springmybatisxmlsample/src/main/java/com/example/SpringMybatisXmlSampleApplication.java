package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"app-db.xml"})
public class SpringMybatisXmlSampleApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(SpringMybatisXmlSampleApplication.class, args);
        System.out.println("Start SpringMybatisXmlSampleApplication OK ######## ");
    }
}
