package com.one.two.moduleOne;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/moduleOne")
@CrossOrigin
public class ModuleOneController {

    @GetMapping("/hello")
    public String getItems() {
    	
        return "hello";
    }
    
}