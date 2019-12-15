package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class HelloService implements IGreetingService {
    public static final String HELLO = "Hello - Primary Dependency Injection";

    @Override
    public String sayHello() {
        return HELLO;
    }
}
