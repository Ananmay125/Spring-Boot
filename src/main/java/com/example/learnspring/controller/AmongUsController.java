package com.example.learnspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AmongUsController {

    @GetMapping("/among-us")
    public String amongUs() {
        return "among-us";
    }
}
