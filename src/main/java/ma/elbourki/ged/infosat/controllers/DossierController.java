package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.elbourki.ged.infosat.entities.Dossier;
import ma.elbourki.ged.infosat.repositories.DocumentJpaRepository;
import ma.elbourki.ged.infosat.repositories.DossierJpaRepository;

@Controller
@RequestMapping("/api/v1/dossiers")
class DossierController {
	@Autowired
	DossierJpaRepository dossierJpaRepository;
	
	@Autowired
	DocumentJpaRepository documentJpaRepository;
	

	// lister tous les dossiers
	@GetMapping("/dossier")
	public String afficherDossier(Model model) {
		List<Dossier> dossiers = dossierJpaRepository.findAll();
		model.addAttribute("dossiers", dossiers);
		return "dossier";
	}

	// ajouter un dossier
	@GetMapping("/formulaire-dossier")
	public String dossierForm(Model model) {
		model.addAttribute("dossier", new Dossier());
		return "dossier-form";
	}
	
	@PostMapping("/ajouter-dossier")
	public String ajouterDossier(@ModelAttribute("dossier") Dossier dossier) {
		dossierJpaRepository.save(dossier);
		return "success";
	}
	
}