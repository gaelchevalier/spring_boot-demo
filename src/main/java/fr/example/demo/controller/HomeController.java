package fr.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import fr.example.demo.injection.ServicePerson;

@Controller
public class HomeController {

	// Injection via attribut => scope = classe. Possibilité d'injecté via constructeur et via fonction => scope = fonction.
	@Autowired
	ServicePerson servicePerson;
	
	@GetMapping("/")
	public String home() {
		
//		servicePerson.test();
		
		return "home";
	}
	
	@GetMapping("/article/{id}")
	public String article(@PathVariable("id") int id) {
		
		System.out.println(String.format("Id transférée depuis l'url %d", id));
		
		// Affiche page home pour le moment
		return "home";
	}
	
	@GetMapping("catalogue")
	public String catalogue(@RequestParam("type") String type) {
		
		System.out.println(String.format("Id transférée depuis l'url %s", type));
		
		// Affiche page home pour le moment
		return "home";
	}
	
	@GetMapping("default-article")
	public String defaultArticle(Model model) {
		// crétation donée
		String articleName = "Pizza";
		
		// Envoie de la donnée dans le model
		model.addAttribute("articleName", articleName);
		
		return "article";
	}

	//Exemple de redirection
	@GetMapping("/test-redirect")
	public String testRedirect() {
		return "redirect:/";
	}
}
