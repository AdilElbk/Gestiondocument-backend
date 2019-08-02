package ma.elbourki.ged.infosat.controllers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ma.elbourki.ged.infosat.entities.Document;
import ma.elbourki.ged.infosat.repositories.DocumentJpaRepository;

@Controller
@RequestMapping("/api/v1/documents")
public class DocumentContoller {
	@Autowired
	private DocumentJpaRepository documentJpaRepository;
	private static final String EXTERNAL_FILE_PATH = "C:/Users/ADIL EL BOURKI/devis";

	/***************** Lister les documents Le Document dans BD ******************/
	@GetMapping("/document")
	public String listDocument(Model model) {
		List<Document> docs = documentJpaRepository.findAll();
		model.addAttribute("documents", docs);
		return "document";
	}

	/***************** Ajouter Le Document dans BD ************************/
	@GetMapping("/ajouter-document")
	public String documentForm(Model model) {
		model.addAttribute("document", new Document());
		return "ajout-document";
	}

	/***************** Upload le document dans un dossier ************/
	@PostMapping("/ajouter-document")
	public String documentAjout(@ModelAttribute("document") Document document, BindingResult bindingResult,
			@RequestParam(name = "file") MultipartFile fichier) {
		try {
			document.setFichier(fichier.getName());
			fichier.transferTo(new File(System.getProperty("user.home") + "/devis/" + fichier.getOriginalFilename()));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		documentJpaRepository.save(document);
		return "result";
	}
	/**********************Telecharger**********************/
	@GetMapping("/file/{fileName:.+}")
	public void downloadFichier(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("fileName") String fileName) throws IOException {
		File file = new File(EXTERNAL_FILE_PATH + fileName);
		if (file.exists()) {
			String mimeType = URLConnection.guessContentTypeFromName(file.getName());
			if (mimeType == null) {
				mimeType = "application/octet-stream ";
			}
			response.setContentType(mimeType);
			response.setHeader("Content-Disposition", String.format("attachment; filename=\"" + file.getName() + "\""));
			// response.setHeader("Content-Disposition", String.format("attachment;
			// filename=\"" + file.getName() + "\""));
			response.setContentLength((int) file.length());
			InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
			FileCopyUtils.copy(inputStream, response.getOutputStream());

		}
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
