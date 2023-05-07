package portfolio.nh.service;

import java.util.List;
import java.util.Optional;
import portfolio.nh.model.MPersona;

public interface IPersonaService {
    
    //método para traer todas las personas
    public List <MPersona> getPersona ();
    //método para crear una persona
    public void savePersona (MPersona pers);
    //método para borrar persona
    public void deletePersona (int id);
    //método para buscar una persona
    public MPersona findPersona (int id);
    public Optional<MPersona> findById(int id);
    public boolean existsById(int id);
    public void editarPersona(MPersona pers);
    
}
