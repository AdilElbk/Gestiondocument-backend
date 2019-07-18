package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.elbourki.ged.infosat.entities.Dossier;
import ma.elbourki.ged.infosat.repositories.DossierJpaRepository;

@RestController
@RequestMapping("/api/v1/dossiers")
public class DossierController {

	@Autowired
	private DossierJpaRepository dossierJpaRepo;

	// afficher tous les dossiers
	@GetMapping
	public List<Dossier> afficherTousLesDossiers() {
		return dossierJpaRepo.findAll();
	}

	// afficher un dossier précis
	@GetMapping("/{id}")
	public Dossier afficherDossiers(@PathVariable("id") Long id) {
		return dossierJpaRepo.getOne(id);

	}

	// ajouter un dossier
	@PostMapping
	public Dossier modifierDossier(@RequestBody Dossier dossier) {
		return dossierJpaRepo.save(dossier);
	}

}
