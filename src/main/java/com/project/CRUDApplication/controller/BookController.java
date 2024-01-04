package com.project.CRUDApplication.controller;

import com.project.CRUDApplication.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @GetMapping("/")
    public String showHome() {
        return "Hello, World!";
    }

}
