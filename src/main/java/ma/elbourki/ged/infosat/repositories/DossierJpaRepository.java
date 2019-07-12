package ma.elbourki.ged.infosat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.elbourki.ged.infosat.entities.Dossier;

public interface DossierJpaRepository extends JpaRepository<Dossier, Long> {

}
