package com.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThController {

    @GetMapping("/hail")
    public String gooners(Model model) {
        model.addAttribute("message", "London");
        return "index";
    }

    @GetMapping("/show")
    public String show() {
        return "withThymeleaf";
    }


    @GetMapping("/bootstrap")
    public String bootstrap() {
        return "withBootstrap";
    }
}
