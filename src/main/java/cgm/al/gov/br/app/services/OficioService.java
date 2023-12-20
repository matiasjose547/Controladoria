package cgm.al.gov.br.app.services;

import cgm.al.gov.br.app.models.Oficio;
import cgm.al.gov.br.app.repositories.OficioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OficioService {
    @Autowired
    private OficioRepository oficioRepository;

    public List<Oficio> findAll(){
        return oficioRepository.findAll();
    }
    public Oficio save(Oficio oficio){
        return oficioRepository.save(oficio);
    }
}
