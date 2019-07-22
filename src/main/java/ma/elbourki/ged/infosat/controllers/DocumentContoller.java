package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.elbourki.ged.infosat.entities.Document;
import ma.elbourki.ged.infosat.repositories.DocumentJpaRepository;

@Controller
@RequestMapping("/api/v1/documents")
public class DocumentContoller {
	@Autowired
	private DocumentJpaRepository documentJpaRepository;

	@GetMapping("/document")
	public String listDocument(Model model) {
		List<Document> docs = documentJpaRepository.findAll();
		model.addAttribute("documents", docs);
		return "document";
	}
	

}

	
//	
//}
//@GetMapping
//public List<Document> afficheTousLesDocuments() {
//	return documentJpaRepository.findAll();
//}
//@GetMapping("/{id}")
//public Document afficheUnDocumentViaId(@PathVariable("id") Long idDocument) {
//	return documentJpaRepository.getOne(idDocument);
//}

//@PutMapping("/{id}")
//public Document modifierDocument(@PathVariable("id") Long idDocument, @RequestBody Document document) {
//
//	Document newDocument = documentJpaRepository.findById(idDocument).get();
//	newDocument.setDossier(document.getDossier());
//	newDocument.setDate(document.getDate());
//	newDocument.setDescriptionDocument(document.getDescriptionDocument());
//	newDocument.setFichier(document.getFichier());
//	newDocument.setNomDocument(document.getNomDocument());
//
//	return document;
//}
//// @PostMapping()
