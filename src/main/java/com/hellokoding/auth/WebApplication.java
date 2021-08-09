package com.hellokoding.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hellokoding.auth.entity.Gender;
import com.hellokoding.auth.entity.Nationality;
import com.hellokoding.auth.entity.User;
import com.hellokoding.auth.service.UserService;
import com.hellokoding.auth.service.UserServiceImpl;

@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebApplication.class);
    }
    

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class, args);

        
    }
}
