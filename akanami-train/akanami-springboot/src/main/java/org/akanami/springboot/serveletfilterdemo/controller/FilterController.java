package org.akanami.springboot.serveletfilterdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilterController {

    @GetMapping("/filter/yes")
    public String getFilterYea() {
        System.out.println("call getFilterYes");

        return "getFilterYes";
    }

    @GetMapping("/filter/no")
    public String getFilterNo() {
        System.out.println("call filterNo");

        return "getFilterNo";
    }
}
