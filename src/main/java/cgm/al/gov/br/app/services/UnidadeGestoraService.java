package cgm.al.gov.br.app.services;

import cgm.al.gov.br.app.models.UnidadeGestora;
import cgm.al.gov.br.app.repositories.UnidadeGestoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeGestoraService {
    @Autowired
    private UnidadeGestoraRepository ugRepository;

    public List<UnidadeGestora> findAll(){
        return ugRepository.findAll();
    }
}
