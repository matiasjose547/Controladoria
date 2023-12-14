package cgm.al.gov.br.app.repositories;

import cgm.al.gov.br.app.models.UnidadeGestora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeGestoraRepository extends JpaRepository<UnidadeGestora, Long> {
}
