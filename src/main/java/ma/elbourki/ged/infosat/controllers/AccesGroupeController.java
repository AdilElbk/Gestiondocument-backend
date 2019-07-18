package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.elbourki.ged.infosat.entities.AccesGroupe;
import ma.elbourki.ged.infosat.repositories.AccesGroupeJpaRepository;

@RestController
@RequestMapping("/api/v1/detail-acces-groupe")
public class AccesGroupeController {
	@Autowired
	private AccesGroupeJpaRepository detailAccesGroupe;
	@GetMapping
	public List<AccesGroupe> afficherDetailsAccesDocument(){
		return detailAccesGroupe.findAll();
	}
	
	@GetMapping("/{id}")
	public AccesGroupe detailAcces(@PathVariable("id") Long idAccesGroupe) {
		return detailAccesGroupe.getOne(idAccesGroupe);
	}
}
