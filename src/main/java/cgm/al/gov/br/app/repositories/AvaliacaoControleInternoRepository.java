package cgm.al.gov.br.app.repositories;

import cgm.al.gov.br.app.models.AvaliacaoControleInterno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AvaliacaoControleInternoRepository extends JpaRepository<AvaliacaoControleInterno, Long> {
}
