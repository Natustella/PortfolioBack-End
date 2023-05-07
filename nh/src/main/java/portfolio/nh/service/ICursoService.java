package portfolio.nh.service;

import java.util.List;
import java.util.Optional;
import portfolio.nh.model.Curso;

public interface ICursoService {
    
    public List <Curso> getCurso ();
    public void saveCurso(Curso curso);
    public void deleteCurso (int id);
    public Curso findCurso (int id);
    public Optional<Curso> findById(int id);
    public boolean existsById(int id);
    public void editarCurso(Curso curso);
}
