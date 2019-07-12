package ma.elbourki.ged.infosat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.elbourki.ged.infosat.entities.Document;

public interface DocumentJpaRepository extends JpaRepository<Document, Long> {

}
