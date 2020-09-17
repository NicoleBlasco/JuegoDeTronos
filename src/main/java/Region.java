import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Region {

        @Id @GeneratedValue
        private Long id;

        private String nombre;
        private int poblacionTotal;

        @ManyToMany
        private List<Castillo> castillos = new ArrayList<Castillo>();

        @ManyToMany
        private List<Ciudad> ciudades = new ArrayList<Ciudad>();


        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPoblacionTotal() {
            return poblacionTotal;
        }

        public void setPoblacionTotal(int poblacionTotal) {
            this.poblacionTotal = poblacionTotal;
        }

        public Long getId() {
            return id;
        }

        public void setCastillos(List<Castillo> castillos) {
        this.castillos = castillos;
    }

        public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
