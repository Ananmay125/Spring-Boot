package com.example.learnspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SusController {

    @GetMapping("/sus")
    public String sus() {
        return "sus";
    }
}
