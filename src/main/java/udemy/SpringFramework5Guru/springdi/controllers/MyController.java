package udemy.SpringFramework5Guru.springdi.controllers;

import org.springframework.stereotype.Controller;
import udemy.SpringFramework5Guru.springdi.services.GreetingService;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
