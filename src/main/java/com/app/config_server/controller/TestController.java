package com.app.config_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("cv-config/self")
    public String test() {
        return "Config Server is working!";
    }
}
