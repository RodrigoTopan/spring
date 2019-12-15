package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements IHelloService {
    public static final String HELLO = "Hello Dependency Injection";

    @Override
    public String sayHello() {
        return HELLO;
    }
}
