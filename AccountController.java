package com.bank.controller;

import com.bank.model.Account;
import com.bank.service.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class AccountController {
    private final BankService bankService;

    public AccountController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/accounts")
    public String viewAccounts(Model model) {
        List<Account> accounts = bankService.getAllAccounts();
        model.addAttribute("accounts", accounts);
        return "accounts";
    }
}
