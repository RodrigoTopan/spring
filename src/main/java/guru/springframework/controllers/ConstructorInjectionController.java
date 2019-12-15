package guru.springframework.controllers;

import guru.springframework.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private IGreetingService iHelloService;

    @Autowired
    // Without qualifier it will receive primary injection
    public ConstructorInjectionController(@Qualifier("greetingService") IGreetingService greetingService) {
        this.iHelloService = greetingService;
    }

    public String sayHello() {
        String helloPhrase = this.iHelloService.sayHello();
        System.out.println(helloPhrase);
        return helloPhrase;
    }

}
