package ma.elbourki.ged.infosat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data 
@Entity
public class Document implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	Long idDocument;
	//@NotEmpty
	String nomDocument;
	//@NotEmpty
	String descriptionDocument;
	//@Lob
	//@NotEmpty
	String fichier;
	//@NotEmpty
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	Date date;
	
	boolean isPublic;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private AccesDocument accesDocument;

	//	Date dateAcces = accesDocument.dateAccesDocument;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_dossier",nullable = false)
	private Dossier dossier;
	//	String nomDossier = dossier.nomDossier;
	
	
	public Long getDossierId() {
		return dossier.getIdDossier();
	}
	
	public String getDossierName() {
		
		return dossier.getNomDossier();
	}
	
	public Dossier getDossier() {
		return dossier;
	}

	public String getDescDossier() {
		return dossier.getDescriptionDossier();
	}
	
}
