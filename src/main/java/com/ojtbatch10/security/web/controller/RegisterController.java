package com.ojtbatch10.security.web.controller;

import com.ojtbatch10.security.bl.dto.AccountDTO;
import com.ojtbatch10.security.bl.service.account.AccountService;
import com.ojtbatch10.security.web.form.AccountForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {
    @Autowired
    AccountService accountService;

    @GetMapping("/register")
    public String registerPage(Model model) {
        // user register
            // username, email, password
        model.addAttribute("accountForm", new AccountForm());
        return "register";
    }

    @PostMapping("/register")
    public String registerAccount(@ModelAttribute AccountForm accountForm) {
        var AccountDTO = new AccountDTO(accountForm);
        accountService.registerAccount(AccountDTO);
        return "redirect:/home";
    }
}
