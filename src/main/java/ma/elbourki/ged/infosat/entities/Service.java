package ma.elbourki.ged.infosat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Service {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idService ;
	String nomService;
	String descriptionService;
	
}
