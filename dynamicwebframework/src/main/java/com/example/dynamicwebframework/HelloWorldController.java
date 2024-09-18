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

    /* 
    @GetMapping(value="muck/(thisString)")
    public String getAKnownPicture(@PathVariable String thisString){
        return "Many silly clowns look like " + thisString;
    }

    @PostMapping(value="silly")
    public String postMethodName(@RequestBody Thing thing){
        return "The" + thing.getRobot() + " robot ate " + String.valueOf(thing) +
        " bananas and ran from a " + thing.getShark() + " shark.\n";
    }
        */
    
}