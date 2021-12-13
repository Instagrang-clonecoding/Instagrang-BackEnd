package com.ingstagrang.ingstabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class IngstabackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(IngstabackendApplication.class, args);
    }

}
