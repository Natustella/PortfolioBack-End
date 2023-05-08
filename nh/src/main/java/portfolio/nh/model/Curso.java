package portfolio.nh.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Curso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Basic
    @Column(nullable = false)
    private String titulo;
    
    private String imag;
    private String dado;
    private String fecha;

    public Curso() {
    }

    public Curso(int id, String titulo, String imag, String dado, String fecha) {
        this.id = id;
        this.titulo = titulo;
        this.imag = imag;
        this.dado = dado;
        this.fecha = fecha;
    }
}