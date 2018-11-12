package com.sreeram.didemo.Services;

//@Service
//@Profile("es")
//@Primary
public class PrimarySpanishGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hola soy de PrimarySpanishGreetingService";
    }
}
