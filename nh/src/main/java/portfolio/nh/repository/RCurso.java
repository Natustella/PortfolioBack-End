package portfolio.nh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.nh.model.Curso;

@Repository
public interface RCurso extends JpaRepository<Curso, Integer> {
    
}
