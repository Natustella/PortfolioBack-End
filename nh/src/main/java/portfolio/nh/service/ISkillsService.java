package portfolio.nh.service;

import java.util.List;
import java.util.Optional;
import portfolio.nh.model.Skills;

public interface ISkillsService {
    
    public List<Skills> getSkills ();
    public void saveSkills (Skills skills);
    public void deleteSkills (int id);
    public Skills findSkills (int id);
    public Optional<Skills> findById(int id);
    public boolean existsById(int id);
    public void editarSkills(Skills skills);
}
