package ma.elbourki.ged.infosat.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Libelle implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idLibelle;
	String nomLibelle;

}
