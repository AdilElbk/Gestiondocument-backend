package ma.elbourki.ged.infosat.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class AccesDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idAccesDocument;
	Date dateAccesDocument;
	
	@OneToMany(mappedBy = "accesDocument",cascade = CascadeType.ALL)
	List<Document>document = new ArrayList<Document>();

}
