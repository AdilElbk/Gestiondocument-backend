package ma.elbourki.ged.infosat.entities;

import java.util.ArrayList;
import java.util.List;

public class GroupeUtilisateur {
	private Long idGroupe;
	private String nomGroupe;
	private String descriptionGroupe;

	
	List<Utilisateur>utilisateurs= new ArrayList<Utilisateur>();
	List<Groupe>groupes= new ArrayList<Groupe>();

	
}
