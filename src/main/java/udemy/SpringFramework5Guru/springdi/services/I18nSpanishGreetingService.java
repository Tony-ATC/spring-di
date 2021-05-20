package udemy.SpringFramework5Guru.springdi.services;

public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Mundo - ES";
    }
}
