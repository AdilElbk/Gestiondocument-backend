package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.elbourki.ged.infosat.entities.PartageDocument;
import ma.elbourki.ged.infosat.repositories.PartageDocumentJpaRepository;

@RestController
@RequestMapping("/api/v1/details-partage")
public class PartageDocumentController {

	PartageDocumentJpaRepository partageDocumentRepository;
	@GetMapping
	public List<PartageDocument> detailsPartage(){
		
		return partageDocumentRepository.findAll();
	}
	
	
}
