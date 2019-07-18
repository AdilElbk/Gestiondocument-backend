package ma.elbourki.ged.infosat.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class AccesDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idAccesDocument;
	Date dateAccesDocument;
}
