package com.upgradehub.loja;

import com.upgradehub.loja.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.myapp.repositories")
public class Store {

    public static void main(String[] args) {
        SpringApplication.run(Store.class, args);
    }

}
