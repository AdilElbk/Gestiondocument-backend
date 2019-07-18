package ma.elbourki.ged.infosat.entities;

import java.util.Date;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class PartageDocument {
	Long idDocument;
	Date datePartage;

}
