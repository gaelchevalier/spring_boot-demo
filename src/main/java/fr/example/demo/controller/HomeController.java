package fr.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fr.example.demo.injection.ServicePerson;

@Controller
public class HomeController {

	// Injection via attribut => scope = classe. Possibilité d'injecté via constructeur et via fonction => scope = fonction.
	@Autowired
	ServicePerson servicePerson;
	
	@GetMapping("/")
	public String home() {
		
		servicePerson.test();
		
		return "home";
	}
}
