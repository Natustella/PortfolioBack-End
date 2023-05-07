package portfolio.nh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.nh.model.Redes;

@Repository
public interface RRedes extends JpaRepository<Redes, Integer>{
    
}
