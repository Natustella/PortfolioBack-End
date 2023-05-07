package portfolio.nh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.nh.model.Proyecto;

@Repository
public interface RProyecto extends JpaRepository<Proyecto, Integer>{
    
}
