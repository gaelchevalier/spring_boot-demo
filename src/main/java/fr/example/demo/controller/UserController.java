package fr.example.demo.controller;

import fr.example.demo.bo.AppUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"loggedUser"})
public class UserController {

    @GetMapping("/login")
    public String login(Model model){

        model.addAttribute("loggedUser", new AppUser("test@test.fr", "test", "test"));

        return "home";
    }

    @GetMapping("/show-user")
    public String showLoggedUser(Model model){

        AppUser loggedUser = (AppUser) model.getAttribute("loggedUser");
        System.out.println(loggedUser.getPseudo());
        return "home";
    }
}
