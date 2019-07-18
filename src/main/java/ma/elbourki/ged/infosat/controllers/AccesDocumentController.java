package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.elbourki.ged.infosat.entities.AccesDocument;
import ma.elbourki.ged.infosat.repositories.AccesDocumentJpaRepository;

@RestController
@RequestMapping("/api/v1/details-acces-document")
public class AccesDocumentController {
	@Autowired
	private AccesDocumentJpaRepository accesDocumentJpaRepository;
	
	@GetMapping
	public List<AccesDocument> afficherDetailAcces(){
		return accesDocumentJpaRepository.findAll();
	}
}