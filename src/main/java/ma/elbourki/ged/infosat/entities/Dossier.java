package ma.elbourki.ged.infosat.entities;

import java.util.ArrayList;
import java.util.List;

public class Dossier {

	private Long idDossier;
	private String nomDossier;
	private String descriptionDossier;

	private List<Document> documents = new ArrayList<Document>();

}
