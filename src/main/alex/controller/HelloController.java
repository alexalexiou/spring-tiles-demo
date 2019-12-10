package main.alex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(Model m) {
        String message = "Spring MVC with Tiles";
        m.addAttribute("message", message);
        return "hello";
    }

}
