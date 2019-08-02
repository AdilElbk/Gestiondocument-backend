//package ma.elbourki.ged.infosat.services;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import ma.elbourki.ged.infosat.entities.Document;
//import ma.elbourki.ged.infosat.entities.Dossier;
//import ma.elbourki.ged.infosat.repositories.DocumentJpaRepository;
//import ma.elbourki.ged.infosat.repositories.DossierJpaRepository;
//
//@Service
//public class DossierService {
//
//	@Autowired
//	DossierJpaRepository dossierJpaRepository;
//	
//	@Autowired
//	DocumentJpaRepository documentJpaRepository;
//	
//	public List<Dossier> getAllDossiers(){
//		return dossierJpaRepository.findAll();
//	}
//	
//	public Dossier createDossier(Long idDocument, Dossier dossier) {
//		List <Dossier> dossiers=new ArrayList<Dossier>();
//		
//		Document document = new Document();
//		Optional<Document> byId = documentJpaRepository.findById(idDocument);
//		
//		
//		List<Document> doc = (List<Document>) byId.get();
//		
//		dossier.setDocuments(doc);
//		
//	}
//}
