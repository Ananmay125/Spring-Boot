package com.example.learnspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrendyController {

    @GetMapping("/trendy")
    public String trendy() {
        return "trendy";
    }
}
