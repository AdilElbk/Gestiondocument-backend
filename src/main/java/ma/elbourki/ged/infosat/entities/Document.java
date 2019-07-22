package ma.elbourki.ged.infosat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	String nomDocument;
	String descriptionDocument;
	String fichier;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	Date date;
	boolean isPublic;
	@ManyToOne(cascade = CascadeType.ALL)
	
	private AccesDocument accesDocument;
//	Date dateAcces = accesDocument.dateAccesDocument;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_dossier")
	private Dossier dossier;
//	String nomDossier = dossier.nomDossier;
	
}
