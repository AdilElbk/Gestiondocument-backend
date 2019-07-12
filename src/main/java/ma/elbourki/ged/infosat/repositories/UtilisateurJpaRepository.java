package ma.elbourki.ged.infosat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.elbourki.ged.infosat.entities.Utilisateur;

public interface UtilisateurJpaRepository extends JpaRepository<Utilisateur, Long> {

}
