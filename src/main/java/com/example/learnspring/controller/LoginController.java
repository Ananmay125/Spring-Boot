package com.example.learnspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private static final String USER1_USERNAME = "sus";
    private static final String USER1_PASSWORD = "sus";// it is because of this .....
    private static final String USER2_USERNAME = "cool";
    private static final String USER2_PASSWORD = "cool";

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginSuccess(@RequestParam String username, @RequestParam String password) {
        if ((USER1_USERNAME.equals(username) && USER1_PASSWORD.equals(password))
                || (USER2_USERNAME.equals(username) && USER2_PASSWORD.equals(password))) {
            return "login-success";
        } else {
            return "redirect:/login?error";
        }
    }
}
