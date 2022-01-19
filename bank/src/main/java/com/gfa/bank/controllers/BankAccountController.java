package com.gfa.bank.controllers;

import com.gfa.bank.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {
    private List<BankAccount> accountList = new ArrayList<>(Arrays.asList(
            new BankAccount("Simba", 2000, "lion",true),
            new BankAccount("Mufasa", 5000, "lion",true),
            new BankAccount("Zazu", 9, "red-billed hornbill",false),
            new BankAccount("Timon", 3, "meerkat",false),
            new BankAccount("Pumbaa", 7000, "warthog",false)
    ));

    @GetMapping("/accounts")
    public String showAccounts(Model model) {
        model.addAttribute("accountList", accountList);
        return "accounts";

    }
}
