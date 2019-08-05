package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.elbourki.ged.infosat.entities.Categorie;
import ma.elbourki.ged.infosat.entities.Service;
import ma.elbourki.ged.infosat.repositories.CategorieJpaRepository;

@Controller
@RequestMapping("/api/v1/documents")
class CategorieController {
	@Autowired
	CategorieJpaRepository catJpaRepository;

	@GetMapping("categories")
	public String listServices(Model model) {

		List<Categorie> category= catJpaRepository.findAll();

		return "success";
	}
	@GetMapping("/formulaire-categorie")
	public String formulaireGroupe(Model model) {
		model.addAttribute("categorie", new Categorie());
		return "form-categorie";
	}

	@PostMapping("/ajouter-categorie")
	public String ajouterGroupe(@ModelAttribute("categorie") Categorie categorie) {
		catJpaRepository.save(categorie);
		return "success";
	}
//
//	@DeleteMapping("/groupes/{id}")
//	public ResponseEntity<Long> supprimerCategorie(@PathVariable Long id) {
//		catJpaRepository.deleteById(id);
//		return null;
//	}
}