package com.kash.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List getUser() {
        List all = List.of(
                "asf",
                "kdkfd",
                "adfd",
                "dfadf"
        );
        return all;
    }

}
