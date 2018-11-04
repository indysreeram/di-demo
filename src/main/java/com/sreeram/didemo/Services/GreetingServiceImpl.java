package com.sreeram.didemo.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String greeting = "Hello Spring Traveller!!!!";

    @Override
    public String sayGreeting() {
        return greeting;
    }
}
