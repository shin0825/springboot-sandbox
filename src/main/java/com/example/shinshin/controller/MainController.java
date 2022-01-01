package com.example.shinshin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String showHello(Model model) {
        model.addAttribute("title", "hellow world");
        model.addAttribute("message", "ようこそ");
        return "Hello";
    }
}
