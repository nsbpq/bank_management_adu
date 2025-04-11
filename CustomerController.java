package com.bank.controller;

import com.bank.model.Customer;
import com.bank.service.BankService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class CustomerController {
    private final BankService bankService;

    public CustomerController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/customers")
    public String viewCustomers(Model model) {
        List<Customer> customers = bankService.getAllCustomers();
        model.addAttribute("customers", customers);
        return "customers";
    }
}
