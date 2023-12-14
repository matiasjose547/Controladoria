package cgm.al.gov.br.app.repositories;

import cgm.al.gov.br.app.models.PrestacaoContasAnual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestacaoContasAnualRepository extends JpaRepository<PrestacaoContasAnual, Long> {
}
