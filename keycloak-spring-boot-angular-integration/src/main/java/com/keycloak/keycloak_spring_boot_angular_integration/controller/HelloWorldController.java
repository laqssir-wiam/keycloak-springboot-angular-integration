package com.keycloak.keycloak_spring_boot_angular_integration.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WIAM
 **/


@RestController
@RequestMapping("/api/v1")
public class HelloWorldController {
    @GetMapping
    public String hello() {
        return "Hello from Spring boot & Keycloak";
    }
}
