package org.example;

import org.example.repository.TodoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class TodoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TodoServerApplication.class, args);
    }
}
