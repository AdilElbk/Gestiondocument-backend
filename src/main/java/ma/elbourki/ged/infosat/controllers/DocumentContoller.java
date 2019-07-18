package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ma.elbourki.ged.infosat.entities.Document;
import ma.elbourki.ged.infosat.repositories.DocumentJpaRepository;

@RestController
@RequestMapping("/api/v1/documents")
public class DocumentContoller {
	@Autowired
	private DocumentJpaRepository documentJpaRepository;

	@GetMapping
	public List<Document> afficheTousLesDocuments() {
		return documentJpaRepository.findAll();
	}

	@GetMapping("/{id}")
	public Document afficheUnDocumentViaId(@PathVariable("id") Long idDocument) {
		return documentJpaRepository.getOne(idDocument);
	}

	@PutMapping("/{id}")
	public Document modifierDocument(@PathVariable("id") Long idDocument, @RequestBody Document document) {

		Document newDocument = documentJpaRepository.findById(idDocument).get();
		newDocument.setDossier(document.getDossier());
		newDocument.setDate(document.getDate());
		newDocument.setDescriptionDocument(document.getDescriptionDocument());
		newDocument.setFichier(document.getFichier());
		newDocument.setNomDocument(document.getNomDocument());

		return document;
	}
	// @PostMapping()
}
