import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Lugar {
    @Id @GeneratedValue
    private Long id;

    private String nombre;
    private int añoDeFundacion;
    private int poblacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoDeFundacion() {
        return añoDeFundacion;
    }

    public void setAñoDeFundacion(int añoDeFundacion) {
        this.añoDeFundacion = añoDeFundacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public Long getId() {
        return id;
    }
}
