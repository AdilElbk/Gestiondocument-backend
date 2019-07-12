package ma.elbourki.ged.infosat.entities;

import java.util.ArrayList;
import java.util.List;

public class PartageDocument {
	private Document document;
	private Departement departement;
	private Service service;
	private Groupe groupe;
	private Utilisateur utilisateur;
	
	List <Document>documents = new ArrayList<Document>();
	List <Departement>departements = new ArrayList<Departement>();
	List <Service>services = new ArrayList<Service>();
	List <Groupe> groupes = new ArrayList<Groupe>();
	List <Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
	
}
