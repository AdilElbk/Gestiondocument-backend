package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.elbourki.ged.infosat.entities.Groupe;
import ma.elbourki.ged.infosat.entities.Service;
import ma.elbourki.ged.infosat.repositories.ServiceJpaRepository;

@Controller
@RequestMapping("/api/v1/documents")
class ServiceController {
	@Autowired
	ServiceJpaRepository serviceJpaRepository;

	@GetMapping("services")
	public String listServices(Model model) {

		List<Service> services = serviceJpaRepository.findAll();

		return "";
	}
	@GetMapping("/formulaire-service")
	public String formulaireGroupe(Model model) {
		model.addAttribute("service", new Service());
		return "form-service";
	}

	@PostMapping("/ajouter-service")
	public String ajouterGroupe(@ModelAttribute("service") Service service) {
		serviceJpaRepository.save(service);
		return "success";
	}
}