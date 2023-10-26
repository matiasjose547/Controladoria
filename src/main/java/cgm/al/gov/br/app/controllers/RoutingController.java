package cgm.al.gov.br.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("app")
public class DefaultController {

    @GetMapping
    public String index(Model model){
        model.addAttribute("Mundo","terra");
        return "index.html";
    }
}
