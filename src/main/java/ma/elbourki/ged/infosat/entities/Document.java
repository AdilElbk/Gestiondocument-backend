package ma.elbourki.ged.infosat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data 
@Entity
public class Document implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	Long idDocument;
	
	String nomDocument;
	String descriptionDocument;
	String fichier;
	Date date;
	boolean isPublic;
	
	
}
