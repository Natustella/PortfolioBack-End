package portfolio.nh.service;

import java.util.List;
import java.util.Optional;
import portfolio.nh.model.Redes;

public interface IRedesService {
    
    public List<Redes> getRedes ();
    public void saveRedes (Redes redes);
    public void deleteRedes (int id);
    public Redes findRedes (int id);
    public Optional<Redes> findById(int id);
    public boolean existsById(int id);
    public void editarRedes(Redes redes);
}
