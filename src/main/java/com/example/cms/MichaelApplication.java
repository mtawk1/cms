package com.example.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MichaelApplication {

    public static void main(String[] args) {
        SpringApplication.run(MichaelApplication.class, args);
    }

}
