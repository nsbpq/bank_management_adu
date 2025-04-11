package com.bank.controller;

import com.bank.model.Transaction;
import com.bank.service.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class TransactionController {
    private final BankService bankService;

    public TransactionController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/transactions")
    public String viewTransactions(Model model) {
        List<Transaction> transactions = bankService.getAllTransactions();
        model.addAttribute("transactions", transactions);
        return "transactions";
    }
}
