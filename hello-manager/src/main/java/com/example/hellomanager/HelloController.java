package com.example.hellomanager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping({"hi","hello"})
    public String hello(@RequestParam(value = "name",defaultValue = "world",required = true) String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
