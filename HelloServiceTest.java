// src/test/java/com/example/webapp/HelloServiceTest.java
package com.example.webapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloServiceTest {
    
    private HelloService service = new HelloService();
    
    @Test
    public void testGetMessage() {
        assertEquals("Hello World!", service.getMessage());
    }
    
    @Test
    public void testGreetWithName() {
        assertEquals("Hello John!", service.greet("John"));
    }
    
    @Test
    public void testGreetWithNull() {
        assertEquals("Hello Guest!", service.greet(null));
    }
    
    @Test
    public void testGreetWithEmptyString() {
        assertEquals("Hello Guest!", service.greet(""));
    }
    
    @Test
    public void testIsValidName() {
        assertTrue(service.isValidName("John"));
        assertFalse(service.isValidName(""));
        assertFalse(service.isValidName("J"));
        assertFalse(service.isValidName("John123"));
        assertFalse(service.isValidName(null));
    }
}
