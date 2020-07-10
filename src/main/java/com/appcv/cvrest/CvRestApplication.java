package com.appcv.cvrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CvRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CvRestApplication.class, args);
    }

}
