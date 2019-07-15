package ma.elbourki.ged.infosat.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idDocument;

	private String nomDocument;
	private String descriptionDocument;
	private Date date;
	private String fichier;
	private boolean isPublic;

	public Long getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(Long idDocument) {
		this.idDocument = idDocument;
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

	public Document(String nomDocument, String descriptionDocument, Date date, String fichier, boolean isPublic) {
		super();
		this.nomDocument = nomDocument;
		this.descriptionDocument = descriptionDocument;
		this.date = date;
		this.fichier = fichier;
		this.isPublic = isPublic;
	}

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Document [idDocument=" + idDocument + ", nomDocument=" + nomDocument + ", descriptionDocument="
				+ descriptionDocument + ", date=" + date + ", fichier=" + fichier + ", isPublic=" + isPublic + "";
	}

}
