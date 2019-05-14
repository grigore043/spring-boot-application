package com.test.spring.boot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

    @RequestMapping("/")
    public String sayHi() {
        return "Hi";
    }

}
