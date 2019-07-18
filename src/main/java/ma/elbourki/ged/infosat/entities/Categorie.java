package ma.elbourki.ged.infosat.entities;

import javax.persistence.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Categorie {
	Long id ;
	String nomCategorie;
	String descriptionCategorie;
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
