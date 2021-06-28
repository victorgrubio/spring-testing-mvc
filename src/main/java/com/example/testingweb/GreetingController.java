package com.example.testingweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    private final GreetingService service;

    public GreetingController(GreetingService service){

        this.service = service;
    }

    @RequestMapping(value="/greeting", method= RequestMethod.GET)
    public @ResponseBody String greeting() {

        return service.greet();
    }
}
