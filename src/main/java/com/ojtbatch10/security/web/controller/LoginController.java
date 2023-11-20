package com.ojtbatch10.security.web.controller;

import com.ojtbatch10.security.web.form.AccountForm;
import com.ojtbatch10.security.web.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginPage(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }
}
