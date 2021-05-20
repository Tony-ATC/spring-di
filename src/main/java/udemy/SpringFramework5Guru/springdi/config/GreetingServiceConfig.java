package udemy.SpringFramework5Guru.springdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import udemy.SpringFramework5Guru.springdi.services.*;

@Configuration
public class GreetingServiceConfig {

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingService i18NSpanishService(){
        return new I18nSpanishGreetingService();
    }

    @Profile("ENG")
    @Bean
    I18nEnglishGreetingService i18nService(){
        return new I18nEnglishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

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
