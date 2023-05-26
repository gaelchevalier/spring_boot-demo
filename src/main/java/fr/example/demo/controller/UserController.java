package fr.example.demo.controller;

import fr.example.demo.bo.AppUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"loggedUser"})
public class UserController {

    @GetMapping("/login")
    public String login(Model model){
        //Stockage de la variable en sessoin
        model.addAttribute("loggedUser", new AppUser("test@test.fr", "test", "test"));

        return "home";
    }

    @GetMapping("/show-user")
    public String showLoggedUser(Model model){
        // Récupération de la variable en session
        AppUser loggedUser = (AppUser) model.getAttribute("loggedUser");
        // Vérification de la présence de la variable
        if (loggedUser == null) {
            System.out.println("Vous êtes déconnectés");
        } else {
            System.out.println(String.format("vous êtes connecté : %s", loggedUser.getPseudo()));
        }
        return "home";
    }

    @GetMapping("/logout")
    public String logout(SessionStatus sessionStatus) {

        // Vide la session
        sessionStatus.setComplete();

        return "redirect:/show-user";
    }
}
