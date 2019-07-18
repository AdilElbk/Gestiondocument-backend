package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.elbourki.ged.infosat.entities.Utilisateur;
import ma.elbourki.ged.infosat.repositories.UtilisateurJpaRepository;

@RestController
@RequestMapping("/api/v1/utilisateurs")
public class UtilisateurController {

	@Autowired
	private UtilisateurJpaRepository utilisateurJpaRepository;
	
	@GetMapping
	public List<Utilisateur> afficherUtilisateurs(){
		return utilisateurJpaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Utilisateur afficherUnUtilisateur(@PathVariable("id") Long idUtilisateur) {
		return utilisateurJpaRepository.getOne(idUtilisateur);
	}
	
	
	
}
