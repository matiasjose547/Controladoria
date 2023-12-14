package cgm.al.gov.br.app.repositories;

import cgm.al.gov.br.app.models.Diaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DiariaRepository extends JpaRepository<Diaria, Long> {
}
