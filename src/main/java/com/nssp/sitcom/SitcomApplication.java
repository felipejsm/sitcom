package com.nssp.sitcom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.map.repository.config.EnableMapRepositories;

@SpringBootApplication
@EnableMapRepositories("com.nssp.sitcom.data.repository")
public class SitcomApplication {

    public static void main(String[] args) {
        SpringApplication.run(SitcomApplication.class, args);
    }

}
