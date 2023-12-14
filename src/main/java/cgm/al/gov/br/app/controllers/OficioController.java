package cgm.al.gov.br.app.controllers;

import cgm.al.gov.br.app.models.Oficio;
import cgm.al.gov.br.app.repositories.OficioRepository;
import org.ietf.jgss.Oid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequestMapping("/oficio")
public class OficioController {

    @Autowired
    private OficioRepository oficioRepository;
    private List<Oficio> oficioList;

    public OficioController() {

        oficioList = new ArrayList<>();
    }

    @GetMapping
    public ModelAndView getPage() {
        List<Oficio> oficios = new ArrayList<Oficio>(this.oficioRepository.findAll());
        return new ModelAndView("oficio.html", (Map<String, ?>) oficios);
    }
}
