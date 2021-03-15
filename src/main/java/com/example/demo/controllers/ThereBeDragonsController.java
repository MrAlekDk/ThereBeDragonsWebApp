package com.example.demo.controllers;

import com.example.demo.services.ImageManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThereBeDragonsController {

    private ImageManager imgmanager = new ImageManager();

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
    public String gallerayPage(Model model){
        model.addAttribute("images",imgmanager.getImages());
        return "gallery.html";
    }

    @GetMapping("/contact")
    public String contactPage(){
        return "contact.html";
    }
}
