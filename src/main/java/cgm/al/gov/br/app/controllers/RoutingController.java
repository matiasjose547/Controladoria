package cgm.al.gov.br.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("app")
public class RoutingController {

    @GetMapping
    public String index(){
        return "aci.html";
    }
    @GetMapping("/aci")
    public ModelAndView getAci(Model model){
        return new ModelAndView("aci.html");
    }

//    @GetMapping(value = "/oficios")
//    public ModelAndView getOficios(){
//        return new ModelAndView("oficios.html");
//    }
    @GetMapping("/adiantamentos")
    public ModelAndView getAdiantamentos(){
        return new ModelAndView("adiantamentos.html");
    }
    @GetMapping("/alertas")
    public ModelAndView getAlertas(){
        return new ModelAndView("alertas.html");
    }
    @GetMapping("/consultorias")
    public ModelAndView getConsultorias(){
        return new ModelAndView("consultorias.html");
    }
    @GetMapping("/diarias")
    public ModelAndView getDiarias(){
        return new ModelAndView("diarias.html");
    }
    @GetMapping("/obras")
    public ModelAndView getObras(){
        return new ModelAndView("obras.html");
    }
    @GetMapping("/pca")
    public ModelAndView getPca(){
        return new ModelAndView("pca.html");
    }

}
