import java.util.ArrayList;
import java.util.List;

public class Suscriptor {
    private String nombre;
    private List<Suscripcion> suscripciones;

    public Suscriptor(String nombre) {
        this.nombre = nombre;
        this.suscripciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Suscripcion> getSuscripciones() {
        return suscripciones;
    }

    public void addSuscripcion(Suscripcion suscripcion) {
        this.suscripciones.add(suscripcion);
    }

    public void removeSuscripcion(Suscripcion suscripcion) {
        this.suscripciones.remove(suscripcion);
    }
}

