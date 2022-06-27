package TareaExamen.Controller;

import TareaExamen.domain.Estados;
import TareaExamen.service.EstadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("/")
    public String inicio(Model model) {

        log.info("MVC");

        var estados = estadoService.getEstados();

        model.addAttribute("estados", estados);
        return "index";
    }

    @GetMapping("/nuevoEstado")
    public String nuevoEstado(Estados estados) {
        return "modificarEstado";
    }
    
    @PostMapping("/guardarEstado")
    public String guardarEstado(Estados estados){ 
        estadoService.save(estados);
        return "redirect:/";
    }
    
    @GetMapping("/modificarEstado/{id_estado}")
    public String modificarEstado(Estados estados, Model model) {
        estados = estadoService.getEstados(estados);
        model.addAttribute("estados",estados);
        return "modificarEstado";
    }
    
    @GetMapping("/eliminarEstado/{id_estado}")
    public String eliminarEstado(Estados estados) {
        estadoService.delete(estados);
        return "redirect:/";
    }
}
