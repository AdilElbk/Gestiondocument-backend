package ma.elbourki.ged.infosat.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Dossier implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idDossier;

	String nomDossier;
	String descriptionDossier;
	
	@OneToMany(mappedBy = "dossier")
	List<Document>documents = new ArrayList<Document>();

	
	Dossier dossier;
}
