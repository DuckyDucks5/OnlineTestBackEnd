package com.example.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.app.Service.AppService;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @Autowired
    private AppService appService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("response", appService.getData());
        return "index";
    }
    
}
