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
public class MPersona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    @Size(max = 100)
    private String nombre;
    
    @Column(nullable = false)
    @Size(max = 200)
    private String position;
    
    @Column(nullable = false)
    @Size(max = 200)
    private String ubicacion;
    
    @Column(nullable = false)
    @Size(max = 400)
    private String imgMe;
    
    @Column(nullable = false)
    @Size(max = 6000)
    private String sobreMi;

    public MPersona() {
    }

    public MPersona(int id, String nombre, String position, String ubicacion, String imgMe, String sobreMi) {
        this.id = id;
        this.nombre = nombre;
        this.position = position;
        this.ubicacion = ubicacion;
        this.imgMe = imgMe;
        this.sobreMi = sobreMi;
    }
}