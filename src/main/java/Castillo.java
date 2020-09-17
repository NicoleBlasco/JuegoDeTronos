import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Castillo extends Lugar{
    @Id @GeneratedValue
    private Long id;

    private Long idLugar; //fk

    /* Como la aplicación no necesita consultar por todos los lugares de una región la desventja de crear
     una tabla por cada subclase se minimiza (y es preferible a hacer una supertabla "Lugar" con muchos campos).
    */

    private int cantidadTorres;
    private int cantidadMurallas;

    public int getCantidadTorres() {
        return cantidadTorres;
    }

    public void setCantidadTorres(int cantidadTorres) {
        this.cantidadTorres = cantidadTorres;
    }

    public int getCantidadMurallas() {
        return cantidadMurallas;
    }

    public void setCantidadMurallas(int cantidadMurallas) {
        this.cantidadMurallas = cantidadMurallas;
    }

    public Long getId() {
        return id;
    }
}
