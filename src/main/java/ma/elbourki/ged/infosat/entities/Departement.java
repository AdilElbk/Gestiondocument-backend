package ma.elbourki.ged.infosat.entities;

import java.util.ArrayList;
import java.util.List;

public class Departement {

	private Long idDepartement;
	private String nomDepartement;
	
	private List<Service>services = new ArrayList<Service>();
}
