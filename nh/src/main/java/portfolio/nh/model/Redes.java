package portfolio.nh.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Redes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String url;
    
    @Column(nullable = false)
    private String icoFont;

    public Redes() {
    }

    public Redes(int id, String url, String icoFont) {
        this.id = id;
        this.url = url;
        this.icoFont = icoFont;
    }
}
