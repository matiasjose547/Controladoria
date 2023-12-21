package cgm.al.gov.br.app.controllers;

import cgm.al.gov.br.app.models.Oficio;
import cgm.al.gov.br.app.services.OficioService;
import cgm.al.gov.br.app.services.UnidadeGestoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("oficios")
public class OficioController {
    @Autowired
    private OficioService oficioService;
    @Autowired
    private UnidadeGestoraService ugService;
    private List<Oficio> oficioList;

    @GetMapping
    public ModelAndView getList() {
        ModelAndView mv = new ModelAndView();
        oficioList = oficioService.findAll();
        mv.addObject("oficioList", oficioList);
        mv.addObject("ugList", ugService.findAll());
        return mv;
    }
    @PostMapping
    public ModelAndView create(Oficio oficio){
        ModelAndView mv = new ModelAndView();
        try {
            Oficio o = oficioService.save(oficio);
            oficioList.add(o);
            mv.addObject("oficioList", oficioList);
            mv.addObject("message", "Oficio criado com sucesso!");
        } catch (Exception e){
            mv.addObject("message", "Erro ao criar oficio, verifique todas as informações correspondentes!");
            e.printStackTrace();
        } finally {
            return mv;
        }
    }

}
