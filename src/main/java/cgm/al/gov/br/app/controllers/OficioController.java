package cgm.al.gov.br.app.controllers;

import cgm.al.gov.br.app.services.OficioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("oficios")
public class OficioController {
    @Autowired
    private OficioService oficioService;
    @GetMapping
    public ModelAndView getPage() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("oficioList", oficioService.findAll());
        return mv;
    }
}
