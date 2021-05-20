package udemy.SpringFramework5Guru.springdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import udemy.SpringFramework5Guru.springdi.services.ConstructorGreetingService;
import udemy.SpringFramework5Guru.springdi.services.PropertyInjectedGreetingService;
import udemy.SpringFramework5Guru.springdi.services.SetterInjectedGreetingService;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
