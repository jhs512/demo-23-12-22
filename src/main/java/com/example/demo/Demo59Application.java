package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SpringBootApplication
@Controller
public class Demo59Application {

    @GetMapping("api/names")
    @ResponseBody
    public List<String> getNames() {
        return List.of("John", "Mary", "Bob");
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo59Application.class, args);
    }

}
