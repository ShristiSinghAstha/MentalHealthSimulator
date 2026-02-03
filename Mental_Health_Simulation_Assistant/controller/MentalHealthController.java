package Mental_Health_Simulation_Assistant.controller;

import Mental_Health_Simulation_Assistant.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MentalHealthController {
    private QuoteProvider quoteProvider = new QuoteProvider();

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/register")
    public String registerForm() {
        return "index";
    }

    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestParam("name") String name, Model model) {
        try {
            user currentUser = new user(name);
            model.addAttribute("currentUser", currentUser);
            model.addAttribute("name", name);
            model.addAttribute("quote", quoteProvider.getRandomQuotes());
            return "dashboard";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}