package com.idspring.crudreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
@SpringBootApplication
public class CrudReactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudReactiveApplication.class, args);
    }
}
