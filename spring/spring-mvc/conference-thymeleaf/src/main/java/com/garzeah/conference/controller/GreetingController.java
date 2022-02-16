package com.garzeah.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting (Map<String, Object> model) {
        model.put("message", "Hello Andy");
        return "greeting"; // Looks for a jsp page named greeting
    }

    @GetMapping("thyme")
    public String thyme (Map<String, Object> model) {
        model.put("message", "Hello ThymeLeaf");
        return "thyme"; // Looks for a thyme page named thyme
    }
}
