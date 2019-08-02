package ma.elbourki.ged.infosat.controllers;

import java.security.acl.Group;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.elbourki.ged.infosat.entities.Groupe;
import ma.elbourki.ged.infosat.repositories.GroupeJpaRepository;
import ma.elbourki.ged.infosat.services.GroupeService;

@Controller
@RequestMapping("/api/v1/documents")
class GroupeController {
	@Autowired
	GroupeJpaRepository groupJpaRepository;
	@Autowired
	GroupeService groupeService;
	// liste des GROUPES
	@GetMapping("/groupes")
	public String listeGroup(Model model) {
		List<Groupe> groupes = groupJpaRepository.findAll();
		model.addAttribute("groupes", groupes);
		return "groupes";
	}
	// ajouter un utilisateur
	@GetMapping("/formulaire-groupe")
	public String formulaireGroupe(Model model) {
		model.addAttribute("group", new Groupe());
		return "form-groupe";
	}
	@PostMapping("/formulaire-groupe")
	public String ajouterGroupe(@ModelAttribute("groupe") Groupe groupe) {
		groupJpaRepository.save(groupe);
		return "success";
	}
	@DeleteMapping("/groupes/{id}")
	public ResponseEntity<Long> supprimerGroupe(@PathVariable Long id) {
		groupJpaRepository.deleteById(id);
		return null;
	}

	@PutMapping("/modifier/{id}")
	public ResponseEntity<Object> modifierUser(@RequestBody Groupe groupe, @PathVariable Long id) {

		Optional<Groupe> group = groupJpaRepository.findById(id);
		
		if(!group.isPresent())
				return ResponseEntity.notFound().build();	
		
		groupe.setNomGroupe(groupe.getNomGroupe());
		groupe.setDescriptionGroupe(groupe.getDescriptionGroupe());
		groupe.setIdGroupe(groupe.getIdGroupe());

		groupJpaRepository.save(groupe);
		return ResponseEntity.noContent().build();
	}

}