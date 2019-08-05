package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.elbourki.ged.infosat.entities.Utilisateur;
import ma.elbourki.ged.infosat.repositories.UtilisateurJpaRepository;

@Controller
@RequestMapping("/api/v1/documents")
class UtilisateurController {
	@Autowired
	UtilisateurJpaRepository utilisateurJpaRepository;

	// liste des utilisateurs
	@GetMapping("/utilisateurs")
	public String listeUtilisateur(Model model) {
		List<Utilisateur> utilisateurs = utilisateurJpaRepository.findAll();
		model.addAttribute("utilisateurs", utilisateurs);
		return "utilisateurs";
	}

	// ajouter un utilisateur
	@GetMapping("/formulaire-utilisateur")
	public String formulaireUtilisateur(Model model) {
		model.addAttribute("utilisateur", new Utilisateur());
		return "form-user";
	}

	@PostMapping("/ajouter-utilisateur")
	public String ajouterUtilisateir(@ModelAttribute("utilisateir") Utilisateur utilisateur) {
		utilisateurJpaRepository.save(utilisateur);
		return "success";
	}
	
	// modifier utilisateur 
	@PutMapping("/{id}")
	public String modifierUtilisateur() {
		return "";
	}
	
}