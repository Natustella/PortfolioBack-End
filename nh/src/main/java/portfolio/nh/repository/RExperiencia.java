package portfolio.nh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.nh.model.Experiencia;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {
}
