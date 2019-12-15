package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {
    @Override
    public String sayHello() {
        return "How are you - Secondary Injection";
    }
}
