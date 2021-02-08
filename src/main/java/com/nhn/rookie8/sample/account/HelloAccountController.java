package com.nhn.rookie8.sample.account;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloAccountController {
    @Value("Hello Account!")
    private String message;

    @GetMapping("/helloaccount")
    public String helloAccount(Model model) {
         model.addAttribute("message", this.message);

         return "helloaccount";
    }
}
