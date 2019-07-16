package ma.elbourki.ged.infosat.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDocument;
	private String tiquette;

	private String nomDocument;
	private String descriptionDocument;
	private Date date;
	private String fichier;
	private boolean isPublic;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Dossier dossier;

	public Long getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(Long idDocument) {
		this.idDocument = idDocument;
	}

	public String getTiquette() {
		return tiquette;
	}

	public void setTiquette(String tiquette) {
		this.tiquette = tiquette;
	}

	public String getNomDocument() {
		return nomDocument;
	}

	public void setNomDocument(String nomDocument) {
		this.nomDocument = nomDocument;
	}

	public String getDescriptionDocument() {
		return descriptionDocument;
	}

	public void setDescriptionDocument(String descriptionDocument) {
		this.descriptionDocument = descriptionDocument;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public Dossier getDossier() {
		return dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}

	public Document(String tiquette, String nomDocument, String descriptionDocument, Date date, String fichier,
			boolean isPublic, Dossier dossier) {
		super();
		this.tiquette = tiquette;
		this.nomDocument = nomDocument;
		this.descriptionDocument = descriptionDocument;
		this.date = date;
		this.fichier = fichier;
		this.isPublic = isPublic;
		this.dossier = dossier;
	}

	public Document() {
		super();
	}

}
