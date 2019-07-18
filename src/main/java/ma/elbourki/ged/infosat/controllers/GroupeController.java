package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.elbourki.ged.infosat.entities.Groupe;
import ma.elbourki.ged.infosat.repositories.GroupeJpaRepository;

@RestController
@RequestMapping("/api/v1/groupes")
public class GroupeController {
	GroupeJpaRepository GroupeJpaRepository;

	@GetMapping
	public List<Groupe> afficherGroupes() {
		return GroupeJpaRepository.findAll();
	}
}
