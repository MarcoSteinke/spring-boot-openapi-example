package com.propra.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiRestController {

    private final List<String> names;

    public ApiRestController() {
        this.names = List.of("Marco", "Bernd", "Peter");
    }

    @GetMapping("/names/all")
    public List<String> names() {
        return this.names;
    }

    @GetMapping("/name/{id}")
    public String name(@PathVariable Integer id) {
        return this.names.get(id);
    }
}
