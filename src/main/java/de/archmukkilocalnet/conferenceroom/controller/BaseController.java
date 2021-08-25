package de.archmukkilocalnet.conferenceroom.controller;

import de.archmukkilocalnet.conferenceroom.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BaseController {
    private final List<User> result = new ArrayList<>();

    @RequestMapping("/home")
    public String getResult(Model model) {
        model.addAttribute("message", "Hi there!");
        return "home";
    }
}
