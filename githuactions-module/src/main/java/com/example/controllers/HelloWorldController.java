package com.example.controllers;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloWorldController {
    @GetMapping
    public String get()
    {
        return "hello world!";
    }
}
