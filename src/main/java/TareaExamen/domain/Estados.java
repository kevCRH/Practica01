package TareaExamen.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estados implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_estado;
    private String nombre_estado;
    private String capital;
    private int poblacion;
    private String costas;

    public Estados() {
    }

    public Estados(String nombre_estado, String capital, int poblacion, String costas) {
        
        this.nombre_estado = nombre_estado;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }

}
