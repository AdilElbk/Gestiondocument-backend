package ma.elbourki.ged.infosat.entities;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class AccesDocument {

	Long idAccesDocument;
	Date dateAccesDocument;
}
