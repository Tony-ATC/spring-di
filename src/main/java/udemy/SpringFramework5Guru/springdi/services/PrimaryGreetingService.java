package udemy.SpringFramework5Guru.springdi.services;

public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - PRIMARY Beam";
    }
}
