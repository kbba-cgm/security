package com.ojtbatch10.security.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/admin/home")
    public void adminHome() {
        System.out.println("welcome to admin home****************");
    }

    @GetMapping("/user/home")
    public void userHome() {
        System.out.println("welcome to user home****************");
    }
}
