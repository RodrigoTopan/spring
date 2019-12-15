package guru.springframework.controllers;

import guru.springframework.services.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private IHelloService iHelloService;

    @Autowired
    public ConstructorInjectionController(IHelloService iHelloService) {
        this.iHelloService = iHelloService;
    }

    public String sayHello() {
        String helloPhrase = this.iHelloService.sayHello();
        System.out.println(helloPhrase);
        return helloPhrase;
    }

}
