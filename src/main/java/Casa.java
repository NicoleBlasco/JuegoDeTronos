import java.util.List;

import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Casa {
    @Id @GeneratedValue
    private Long id;

    private String nombre;
    private int añoDeFundacion;
    private int patrimonio;

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAñoDeFundacion() {
        return añoDeFundacion;
    }

    public int getPatrimonio() {
        return patrimonio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAñoDeFundacion(int añoDeFundacion) {
        this.añoDeFundacion = añoDeFundacion;
    }

    public void setPatrimonio(int patrimonio) {
        this.patrimonio = patrimonio;
    }

}