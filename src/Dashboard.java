import java.util.ArrayList;
import java.util.List;

public class Dashboard {
    private List<Cliente> clientes;
    private List<Cafe> cafes;
    private List<Suscripcion> suscripciones;

    // Constructor
    public Dashboard() {
        this.clientes = new ArrayList<>();
        this.cafes = new ArrayList<>();
        this.suscripciones = new ArrayList<>();
    }

    // Métodos para agregar clientes, productos, suscripciones, pagos
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarCafes(Cafe cafe) {
        cafes.add(cafe);
    }

    public void agregarSuscripcion(Suscripcion suscripcion) {
        suscripciones.add(suscripcion);
    }

    // Métodos para obtener listas de clientes, cafes, suscripciones, pagos
    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Cafe> getCafes() {
        return cafes;
    }

    public List<Suscripcion> getSuscripciones() {
        return suscripciones;
    }
}
