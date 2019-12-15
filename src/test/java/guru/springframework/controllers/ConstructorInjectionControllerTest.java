package guru.springframework.controllers;

import guru.springframework.services.HelloService;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ConstructorInjectionControllerTest {
    private ConstructorInjectionController constructorInjectionController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectionController = new ConstructorInjectionController(new HelloService());
    }

    @Test
    public void testConstructor() throws Exception {
        Assert.assertEquals(HelloService.HELLO, this.constructorInjectionController.sayHello());
    }
}
