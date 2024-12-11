package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    // GET http://localhost:8080/
    @GetMapping("/")
    public void home() {
        System.out.println("home");
    }

    // GET http://localhost:8080/about
    @GetMapping("/about")
    public void about() {
        System.out.println("about");
    }
}