package portfolio.nh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import portfolio.nh.model.Skills;

@Repository
public interface RSkills extends JpaRepository<Skills, Integer>{
    
}
