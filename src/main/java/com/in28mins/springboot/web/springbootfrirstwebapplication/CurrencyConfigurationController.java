package com.in28mins.springboot.web.springbootfrirstwebapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @RequestMapping("/currencyConfiguration")
    public CurrencyServiceConfiguration getAllCourses() {
        return currencyServiceConfiguration;
    }
}
