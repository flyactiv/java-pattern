package com.example.lesson14.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @GetMapping("/index")       //Контроллер для отслеживания url страницы контактов web-ресурса
    public String home(Model model) {
        model.addAttribute("title", "Страница home");
        return "home";
    }
}
