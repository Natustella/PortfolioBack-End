package portfolio.nh.service;

import java.util.List;
import java.util.Optional;
import portfolio.nh.model.Proyecto;

public interface IProyectoService {
    
    public List <Proyecto> getProyecto ();
    public void saveProyecto(Proyecto proyecto);
    public void deleteProyecto (int id);
    public Proyecto findProyecto (int id);
    public Optional<Proyecto> findById(int id);
    public boolean existsById(int id);
    public void editarProyecto(Proyecto proyecto);
}
