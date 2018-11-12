package com.sreeram.didemo.Controllers;

import com.sreeram.didemo.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("constructorGreetingService")
    GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
