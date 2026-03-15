package org.santa.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController { //TODO: Удалить потом, как все налажу

    @GetMapping
    public String sayHello() {
        return "Hello, Serega!!!!";
    }
}
