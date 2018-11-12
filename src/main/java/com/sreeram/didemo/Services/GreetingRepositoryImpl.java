package com.sreeram.didemo.Services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello World I am spring application";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo Welt ich bin Frühlingsanwendung";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola mundo soy aplicación de primavera";
    }
}
