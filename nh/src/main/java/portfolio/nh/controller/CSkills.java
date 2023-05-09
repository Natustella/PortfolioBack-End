package portfolio.nh.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import portfolio.nh.model.Skills;
import portfolio.nh.service.ISkillsService;

@RestController
@CrossOrigin(origins = "https://portfolio-eb2dc.web.app")
public class CSkills {
    
    @Autowired
    private ISkillsService iSkills;
    
    @GetMapping("s")
    public ResponseEntity<List<Skills>> list() {
        List<Skills> skills = iSkills.getSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    
    @GetMapping("/skills/detalle/{id}")
    public ResponseEntity<Skills> getById(@PathVariable("id") int id){
        Optional<Skills> optionalSkills = iSkills.findById(id);
        if(optionalSkills.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    Skills skills = optionalSkills.get();
    return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PostMapping("/skills/crear")
    public void save(@RequestBody Skills skills) {
        iSkills.saveSkills(skills);
    }

    @DeleteMapping("/skills/borrar/{id}")
    public void delete(@PathVariable("id") int id) {
        iSkills.deleteSkills(id);
    }

    @PutMapping("skills/editar/")
    public void editarSkills (@RequestBody Skills skills) {
        iSkills.editarSkills(skills);
    }
}