package portfolio.nh.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @Size(min = 1, max = 100)
    private String pos;
    
    @Column(nullable = false)
    @Size(min = 1, max = 400)
    private String logo;
    
    @Column(nullable = false)
    @Size(min = 1, max = 100)
    private String empresa;
    
    @Column(nullable = false)
    @Size(min = 1, max = 100)
    private String desde;
    
    @Column(nullable = false)
    @Size(min = 1, max = 100)
    private String hasta;
    
    @Column(nullable = false)
    @Size(min = 1, max = 500)
    private String actividad;

    public Experiencia() {
    }

    public Experiencia(int id, String pos, String logo, String empresa, String desde, String hasta, String actividad) {
        this.id = id;
        this.pos = pos;
        this.logo = logo;
        this.empresa = empresa;
        this.desde = desde;
        this.hasta = hasta;
        this.actividad = actividad;
    }
}
