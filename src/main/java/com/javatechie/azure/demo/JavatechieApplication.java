package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavatechieApplication {

    @GetMapping("/message")
    public String message() {
        return "Congratulations. Your app has been deployed successfully in Azure";
    }

    public static void main(String[] args) {
        SpringApplication.run(JavatechieApplication.class, args);
    }

}
