package ma.elbourki.ged.infosat.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.elbourki.ged.infosat.entities.Service;
import ma.elbourki.ged.infosat.repositories.ServiceJpaRepository;

@RestController
@RequestMapping("/api/v1/services")
public class ServiceController {
	ServiceJpaRepository serviceJpaRepository;

	@GetMapping
	public List<Service> afficherServices() {

		return serviceJpaRepository.findAll();
	}

	@GetMapping("/{id}")
	public Service afficherUnService(@PathVariable("id") Long idService) {
		return serviceJpaRepository.getOne(idService);
	}
/*
	@PostMapping("/{id}")
	public Service ajouterService()
*/
}
