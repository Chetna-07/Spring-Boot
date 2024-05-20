package com.learnSpringBoot.LearnrestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
    @Autowired
    private CurrencyServiceConfiguration configuration;

    @GetMapping("/currency")
    public CurrencyServiceConfiguration currencyDetail(){
        return this.configuration;
    }
}
