package portfolio.nh.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @Min(0)
    @Max(100)
    private int percent;
    
    @Column(nullable = false)
    private String habilidad;

    public Skills() {
    }

    public Skills(int id, int percent, String habilidad) {
        this.id = id;
        this.percent = percent;
        this.habilidad = habilidad;
    }
}
