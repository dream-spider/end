package com.spider.end;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class EndApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndApplication.class, args);
    }

}
