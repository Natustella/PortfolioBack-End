package portfolio.nh.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import portfolio.nh.model.MPersona;
import portfolio.nh.service.IPersonaService;

@RestController
@CrossOrigin(origins = "https://portfolio-eb2dc.web.app")
public class CPersona {
    
    @Autowired
    IPersonaService iPers;
    
    @GetMapping("/persona/perfil")
    public MPersona findPersona() {
        return iPers.findPersona((int) 1);
    }

    @GetMapping("/persona/traer")
    public List<MPersona> getPersona() {
        return iPers.getPersona();
    }

    @PostMapping("/persona/crear")
    public String createPersona(@RequestBody MPersona pers) {
        iPers.savePersona(pers);
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable int id) {
        iPers.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping ("persona/editar/")
    public void editarPersona(@RequestBody MPersona pers){
        iPers.editarPersona(pers);
    }
}

