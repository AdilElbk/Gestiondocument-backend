package ma.elbourki.ged.infosat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id ;
	String nomCategorie;
	String descriptionCategorie;
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
