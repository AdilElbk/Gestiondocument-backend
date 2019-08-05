package ma.elbourki.ged.infosat.services;

import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;

import ma.elbourki.ged.infosat.entities.Document;
import ma.elbourki.ged.infosat.exceptions.MyFileNotFoundException;
import ma.elbourki.ged.infosat.repositories.DocumentJpaRepository;

public class DocumentService {
@Autowired
private DocumentJpaRepository documentJpaRepository;

public Optional<Document> getFichier(Long documentId) {
	return documentJpaRepository.findById(documentId);

}
}
