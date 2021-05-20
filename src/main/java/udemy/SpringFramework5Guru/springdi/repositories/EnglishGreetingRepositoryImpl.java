package udemy.SpringFramework5Guru.springdi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - ENG";
    }
}
