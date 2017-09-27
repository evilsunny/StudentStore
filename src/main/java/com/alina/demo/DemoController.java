package com.alina.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class DemoController {
    
    @RequestMapping("/")
    public String showMenu(){
        return "main-menu";
    }

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormTwo")
    public String letsShoutDude(@RequestParam("studentName") String theName, Model model){
        String name = theName.toUpperCase();
        String result = "Yo!  " + name;
        model.addAttribute("message", result);
        return "helloworld";
    }
    
}
