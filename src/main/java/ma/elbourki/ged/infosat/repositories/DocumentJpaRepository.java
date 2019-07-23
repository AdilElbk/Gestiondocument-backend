package ma.elbourki.ged.infosat.repositories;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

import ma.elbourki.ged.infosat.entities.Document;

public interface DocumentJpaRepository extends JpaRepository<Document, Long> {
//	void init();
//
//	void store(MultipartFile file);
//
//	Stream<Path> loadAll();
//
//	Path load(String filename);
//
//	Resource loadAsResource(String filename);
//
//	void deleteAll();
}
