// Save this as: src/main/java/com/example/webapp/HelloService.java
package com.example.webapp;

public class HelloService {
    public String getMessage() {
        return "Hello World!";
    }
    
    public String greet(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello Guest!";
        }
        return "Hello " + name + "!";
    }
    
    public boolean isValidName(String name) {
        return name != null && name.length() >= 2 && name.matches("[a-zA-Z]+");
    }
}
