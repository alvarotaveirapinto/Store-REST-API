package com.upgradehub.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.myapp.repositories")
public class Store {

    public static void main(String[] args) {SpringApplication.run(Store.class, args);}}
