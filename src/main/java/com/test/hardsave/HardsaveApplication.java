package com.test.hardsave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class HardsaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(HardsaveApplication.class, args);
    }

}
