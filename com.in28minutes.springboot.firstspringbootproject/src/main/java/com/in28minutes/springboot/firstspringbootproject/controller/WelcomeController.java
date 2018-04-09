package com.in28minutes.springboot.firstspringbootproject.controller;

import com.in28minutes.springboot.firstspringbootproject.configuration.BasicConfiguration;
import com.in28minutes.springboot.firstspringbootproject.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WelcomeController {

    //Auto wiring
    @Autowired
    private WelcomeService service;

    @Autowired
    private BasicConfiguration configuration;

    @RequestMapping("/welcome")
    public String welcome() {
        return service.retrieveWelcomeMessage();
    }

    @RequestMapping("/dynamic-configuration")
    public Map dynamicConfiguration() {
        Map map = new HashMap();
        map.put("message", configuration.getMessage());
        map.put("number", configuration.getNumber());
        map.put("value", configuration.isValue());

        return map;
    }

}
