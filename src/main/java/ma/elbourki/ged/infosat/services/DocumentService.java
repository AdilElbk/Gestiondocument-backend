package ma.elbourki.ged.infosat.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import ma.elbourki.ged.infosat.entities.Document;
import ma.elbourki.ged.infosat.repositories.DocumentJpaRepository;

public class DocumentService {
@Autowired
private DocumentJpaRepository documentJpaRepository;

public Optional<Document> getFichier(Long documentId) {
	return documentJpaRepository.findById(documentId);
}
}
