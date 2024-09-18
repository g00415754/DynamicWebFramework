package com.example.dynamicwebframework;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HelloWorldController
*/

@RestController
public class HelloWorldController {
    @GetMapping(value="howya")
    public String getHelloWorld(){
        return "Many silly clowns look like they know everything";
    }
    
}