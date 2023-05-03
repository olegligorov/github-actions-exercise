package com.imageclassification.web;

import com.imageclassification.entity.Greeting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingControllerTest {

    @Test
    void testGreeting() {
        GreetingController greetingController = new GreetingController();
        Greeting response = greetingController.greeting("name");
        Greeting response2 = greetingController.greeting("world");
        Greeting expected = new Greeting(1, "Hello, name!");
        Greeting expected2 = new Greeting(2, "Hello, world!");

        assertEquals(response, expected);
        assertEquals(response2, expected2);

    }
}
