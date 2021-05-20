package udemy.SpringFramework5Guru.springdi.services;

public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - ENG";
    }
}
