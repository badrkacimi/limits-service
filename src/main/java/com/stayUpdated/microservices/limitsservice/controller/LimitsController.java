package com.stayUpdated.microservices.limitsservice.controller;


import com.stayUpdated.microservices.limitsservice.Data.Limits;
import com.stayUpdated.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
       //return new Limits(1,1000);
    }
}
