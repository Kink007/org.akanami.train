package org.akanami.springboot.interceptordemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {

    @GetMapping("/console")
    public String getConsole() {
        System.out.println("call getConsole");
        return "Hello GetConsole";
    }

    @GetMapping("/console/no")
    public String noConsole() {
        System.out.println("call noConsole");
        return "Hello NoConsole";
    }
}
