package ma.elbourki.ged.infosat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idDepartement;
	String nomDepartement;
	String DescriptionDepartement;
	
}
