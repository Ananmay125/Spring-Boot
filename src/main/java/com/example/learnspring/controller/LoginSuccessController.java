package com.example.learnspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.Year;

@Controller
public class LoginSuccessController {

    @GetMapping("/login-success")
    public String loginSuccess(Model model) {
        // Retrieve the current year
        int currentYear = Year.now().getValue();

        // Add the current year to the model
        model.addAttribute("currentYear", currentYear);

        return "login-success";
    }
}