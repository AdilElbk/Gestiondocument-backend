package ma.elbourki.ged.infosat.controllers;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ma.elbourki.ged.infosat.entities.Document;
import ma.elbourki.ged.infosat.repositories.DocumentJpaRepository;

@Controller
@RequestMapping("/api/v1/documents")
public class AjouterDocumentController {
	
	@Autowired
	DocumentJpaRepository documentJpaRepository;
	
//	@Value("${dir.files}")
//	private String fileDir;

	@GetMapping("/ajouter-document")
	public String documentForm(Model model) {

		model.addAttribute("document", new Document());
		return "ajout-document";

	}

	@PostMapping("/ajouter-document")
	public String documentAjout(@ModelAttribute("document") Document document,BindingResult bindingResult,
		@RequestParam(name = "file") MultipartFile fichier) {
		try {
			System.out.println("------------------------------");
			System.out.println(fichier.getOriginalFilename());
			document.setFichier(fichier.getOriginalFilename());
			fichier.transferTo(new File(System.getProperty("user.home")+"/sco/"+fichier.getOriginalFilename()));
//			fichier.transferTo(new File(fileDir));	
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		documentJpaRepository.save(document);
		return "result";
	}
}
