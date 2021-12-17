package com.javatechie.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerImageApplication {

    @GetMapping("/")
    public String runImage() {
        return "Docker image created and running ...";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerImageApplication.class, args);
    }

}
