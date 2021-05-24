package udemy.SpringFramework5Guru.springdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Created a Singleton Bean ! ! !");
    }

    public String getMyScope(){

        return "I'm a Singleton";
    }
}
