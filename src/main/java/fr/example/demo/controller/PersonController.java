package fr.example.demo.controller;

import fr.example.demo.bo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PersonController {

    @GetMapping("person/{slug}")
    public String person(@PathVariable("slug") String slug, Model model) {

        Person person = new Person("Knight", "Gaw", slug);
        model.addAttribute("person", person);

        return "person/person";
    }
}
