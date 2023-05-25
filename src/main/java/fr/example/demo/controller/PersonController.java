package fr.example.demo.controller;

import fr.example.demo.bo.Person;
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

    @GetMapping("person/{slug}")
    public String person(@PathVariable("slug") String slug, Model model) {

        Person person = new Person("Knight", "Gaw", slug);
        model.addAttribute("person", person);

        return "person/person";
    }

    @PostMapping("person")
    public String personSubmit(@ModelAttribute("formPerson") Person person) {

        System.out.println(String.format("Person : %s", person.getFirstname()));

        return "redirect:/";
    }

    @GetMapping("show-persons")
    public String showAllPerson(Model model) {
        // 1. Données en dur
        List<Person> persons = Arrays.asList(new Person[] {
            new Person("Gaw", "Knight", "gknight"),
            new Person("John", "Doe", "jod"),
            new Person("Jane", "Doe", "jane")
        });
        // 2. envoyer données dans model pour la vue
        model.addAttribute("persons", persons);
        // 3. retourner la vue
        return "person/person-list";

    }
}
