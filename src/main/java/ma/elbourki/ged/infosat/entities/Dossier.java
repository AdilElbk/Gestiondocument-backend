package ma.elbourki.ged.infosat.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dossier {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDossier;
	private String nomDossier;
	private String descriptionDossier;

	@OneToMany(mappedBy = "dossier",cascade = CascadeType.ALL)
	private List<Document> documents = new ArrayList<Document>();

	public Dossier(String nomDossier, String descriptionDossier, List<Document> documents) {
		super();

		this.nomDossier = nomDossier;
		this.descriptionDossier = descriptionDossier;
		this.documents = documents;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public Long getIdDossier() {
		return idDossier;
	}

	public void setIdDossier(Long idDossier) {
		this.idDossier = idDossier;
	}

	public String getNomDossier() {
		return nomDossier;
	}

	public void setNomDossier(String nomDossier) {
		this.nomDossier = nomDossier;
	}

	public String getDescriptionDossier() {
		return descriptionDossier;
	}

	public void setDescriptionDossier(String descriptionDossier) {
		this.descriptionDossier = descriptionDossier;
	}

	public Dossier(String nomDossier, String descriptionDossier) {
		super();
		this.nomDossier = nomDossier;
		this.descriptionDossier = descriptionDossier;
	}

	public Dossier() {
		super();
		// TODO Auto-generated constructor stub
	}

}
