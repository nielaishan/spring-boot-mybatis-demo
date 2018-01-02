package com.example.demo.Controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloController {

    @Autowired
    private TestService testService;

    @RequestMapping("/sayhello")
    public String sayHello() {
        return "Hello World";
    }

    @RequestMapping("/show")
    public String show() {
        return testService.showUsername(1);
    }

}
