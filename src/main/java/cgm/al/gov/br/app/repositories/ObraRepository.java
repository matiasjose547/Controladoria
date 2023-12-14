package cgm.al.gov.br.app.repositories;

import cgm.al.gov.br.app.models.Obra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObraRepository extends JpaRepository<Obra, Long> {
}
