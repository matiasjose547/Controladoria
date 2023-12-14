package cgm.al.gov.br.app.repositories;

import cgm.al.gov.br.app.models.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServidorRepository extends JpaRepository<Servidor, Long> {
}
