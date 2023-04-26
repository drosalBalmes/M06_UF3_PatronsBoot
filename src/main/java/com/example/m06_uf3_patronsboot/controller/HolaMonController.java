package com.example.m06_uf3_patronsboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HolaMonController {
    @GetMapping("hola")
    public String hola(Model model) {
        model.addAttribute("salutacio", "Hola Mon Spring amb Java configuration");
        return "benvinguda";
    }

    @GetMapping("holadenou")
    public String holaDeNou(Model model) {
        model.addAttribute("salutacio", "Hola Mon de nou Spring amb Java configuration");
        return "benvinguda";
    }
}
