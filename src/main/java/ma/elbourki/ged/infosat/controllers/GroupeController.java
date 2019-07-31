package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.elbourki.ged.infosat.entities.Groupe;
import ma.elbourki.ged.infosat.entities.Utilisateur;
import ma.elbourki.ged.infosat.repositories.GroupeJpaRepository;

@Controller
@RequestMapping("/api/v1/documents")
class GroupeController {
	@Autowired
	GroupeJpaRepository groupJpaRepository;

	// liste des GROUPES
	@GetMapping("/groupes")
	public String listeGroup(Model model) {
		List<Groupe> groupes = groupJpaRepository.findAll();
		model.addAttribute("groupes", groupes);
		return "groupes";
	}

	// ajouter un utilisateur
	@GetMapping("/formulaire-groupe")
	public String formulaireGroupe(Model model) {
		model.addAttribute("group", new Groupe());
		return "form-groupe";
	}

	@PostMapping("/ajouter-groupe")
	public String ajouterGroupe(@ModelAttribute("groupe") Groupe groupe) {
		groupJpaRepository.save(groupe);
		return "success";
	}
}