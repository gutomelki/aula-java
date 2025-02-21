package com.fiap.ecr.aula_fiap.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class hellocontroller {
    @GetMapping
    public String sayHello() {
        return "Olá, Spring Boot!";
    }
}
