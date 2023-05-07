package portfolio.nh.service;

import java.util.List;
import java.util.Optional;
import portfolio.nh.model.Experiencia;

public interface IExperienciaService {
    
    public List <Experiencia> getExperiencia ();
    public void saveExperiencia(Experiencia exp);
    public void deleteExperiencia (int id);
    public Experiencia findExperiencia (int id); 
    public Optional<Experiencia> findById(int id);
    public boolean existsById(int id);
    public void editarExperiencia(Experiencia experiencia);
}
