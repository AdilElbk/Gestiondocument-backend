package ma.elbourki.ged.infosat.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.elbourki.ged.infosat.entities.Document;
import ma.elbourki.ged.infosat.repositories.DocumentJpaRepository;

@Controller
@RequestMapping("/api/v1/documents")
public class AjouterDocumentController {

	@Autowired
	DocumentJpaRepository documentJpaRepository;
	
	@GetMapping("/ajouter-document")
	public String documentForm(Model model) {
		
		model.addAttribute("document", new Document());
		return "ajout-document";
		
		
	}
	
	@PostMapping("/ajouter-document")
	public String documentAjout(@ModelAttribute("document") Document document)
	{	
		
		documentJpaRepository.save(document);
		return "result";
	}
}
