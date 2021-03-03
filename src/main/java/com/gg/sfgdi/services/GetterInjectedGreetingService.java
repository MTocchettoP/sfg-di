package com.gg.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Getter";
    }
}
