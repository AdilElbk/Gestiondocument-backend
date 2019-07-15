package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ma.elbourki.ged.infosat.entities.Document;
import ma.elbourki.ged.infosat.repositories.DocumentJpaRepository;

@RestController
@RequestMapping("/api/v1/documents")
public class DocumentContoller {

	@Autowired
	private DocumentJpaRepository documentJpaRepo;
	
	@GetMapping
	public List<Document> afficherTousLedocs(){
		return documentJpaRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Document afficherUnDoc(@PathVariable("id") Long id) {
		return documentJpaRepo.getOne(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Document modifierDocument(@RequestBody Document document) {
		
		return documentJpaRepo.save(document);
	}
}
