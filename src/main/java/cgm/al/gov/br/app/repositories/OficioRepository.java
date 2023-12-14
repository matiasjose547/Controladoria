package cgm.al.gov.br.app.repositories;

import cgm.al.gov.br.app.models.Oficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OficioRepository extends JpaRepository<Oficio, Long> {
    List<Oficio> findAll();
}
