package portfolio.nh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Min(0)
    @Max(100)
    private int percent;
    
    @NotNull
    private String habilidad;

    public Skills() {
    }

    public Skills(int id, int percent, String habilidad) {
        this.id = id;
        this.percent = percent;
        this.habilidad = habilidad;
    }
}
