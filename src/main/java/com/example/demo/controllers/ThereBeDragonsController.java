package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThereBeDragonsController {


    @GetMapping("/")
    public String mainPage(){
        return "index.html";
    }

    @GetMapping("/about")
    public String aboutPage(){

        return "about.html";
    }

    @GetMapping("/work")
    public String workPage(){

        return "work.html";
    }

    @GetMapping("/gallery")
    public String gallerayPage(){
        return "gallery.html";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return "contact.html";
    }
}
