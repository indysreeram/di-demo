package com.sreeram.didemo.Services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Spring !! I was injected in GetterGreetingService ";
    }
}
