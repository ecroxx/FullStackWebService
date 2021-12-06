package com.egemen.fullstackwebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @GetMapping("/test")
    public String testApi() {
        return "Hello from full stack template which is implemented by Java/Spring and Vue JS";
    }
}
