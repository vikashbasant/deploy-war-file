package com.kash.deploywarfile.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {


    @GetMapping("/users")
    public List getUser() {
        return List.of(
                "Kamal",
                "Rana",
                "Random",
                "Jitu",
                "Neha"
                );
    }
}
