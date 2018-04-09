package com.in28minutes.springboot.firstspringbootproject.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    @Value("${welcome.message}")
    private String welcomeMessage;

    public String retrieveWelcomeMessage() {
        //Complex Method
        return welcomeMessage;
    }


}
