package com.sreeram.didemo.Controllers;

import com.sreeram.didemo.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    GreetingService greetingService;

    public HomeController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello World !!!");
        return greetingService.sayGreeting();
    }
}
