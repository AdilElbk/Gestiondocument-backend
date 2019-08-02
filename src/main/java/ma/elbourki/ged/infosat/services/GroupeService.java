package ma.elbourki.ged.infosat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.elbourki.ged.infosat.entities.Groupe;
import ma.elbourki.ged.infosat.repositories.GroupeJpaRepository;

@Service
public class GroupeService {
	List<Groupe> groupes ;
	@Autowired
	GroupeJpaRepository groupJpaRepository;
	public Groupe findById(Long id) {
		for(Groupe groupe : groupes ) {
			if(groupe.getIdGroupe()==id) {
				return groupe;
			}
		}
		return null;
	}
}
