package portfolio.nh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.nh.model.MPersona;

@Repository
public interface RPersona extends JpaRepository <MPersona, Integer>{
    
}
