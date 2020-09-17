import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Calendar;

@Entity
public class Ciudad {
    @Id @GeneratedValue
    private Long id;

    private int cantidadComercios;
    private int cantidadSantuarios;
    private double tasaMortalidad;

    public int getCantidadComercios() {
        return cantidadComercios;
    }

    public int getCantidadSantuarios() {
        return cantidadSantuarios;
    }

    public double getTasaMortalidad() {
        return tasaMortalidad;
    }

    public void setCantidadComercios(int cantidadComercios) {
        this.cantidadComercios = cantidadComercios;
    }

    public void setCantidadSantuarios(int cantidadSantuarios) {
        this.cantidadSantuarios = cantidadSantuarios;
    }

    public void setTasaMortalidad(double tasaMortalidad) {
        this.tasaMortalidad = tasaMortalidad;
    }

    public Long getId() {
        return id;
    }
}
