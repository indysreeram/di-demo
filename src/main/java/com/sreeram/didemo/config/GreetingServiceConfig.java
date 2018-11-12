package com.sreeram.didemo.config;

import com.sreeram.didemo.Services.GreetingFactoryService;
import com.sreeram.didemo.Services.GreetingRepository;
import com.sreeram.didemo.Services.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingFactoryService greetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingFactoryService(greetingRepository);
    }

    @Bean
    @Primary
    @Profile("en")
    GreetingService primaryGreetingService(GreetingFactoryService greetingFactoryService){
        return greetingFactoryService.createGreetingService("en");
    }
    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingFactoryService greetingFactoryService){
        return greetingFactoryService.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingFactoryService greetingFactoryService){
        return greetingFactoryService.createGreetingService("es");
    }
}

