package fr.example.demo.controller;

import fr.example.demo.bll.PersonService;
import fr.example.demo.bo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("person/{slug}")
    public String person(@PathVariable("slug") String slug, Model model) {

        Person person = personService.getPersonBySlug(slug);
        model.addAttribute("person", person);

        return "person/person";
    }

    @PostMapping("person")
    public String personSubmit(@ModelAttribute("formPerson") Person person) {

//        System.out.println(String.format("Person : %s", person.getFirstname()));

        return "redirect:/";
    }

    @GetMapping("show-persons")
    public String showAllPerson(Model model) {
        // 1. envoyer données dans model pour la vue
        model.addAttribute("persons", personService.getAll());
        // 2. retourner la vue
        return "person/person-list";
    }
}
