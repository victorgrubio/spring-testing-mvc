package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
    private final GreetingServce service;

    public GreetingController(GreetingService service){
        this.service = service;
    }

    @RequestMapping(value="/greeting", method= RequestMethod.GET)
    public @ResponseBody String greeting() {
        return service.greet();
    }
}
