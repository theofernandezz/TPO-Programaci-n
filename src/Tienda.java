import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Cafe> menu;

    public Tienda() {
        menu = new ArrayList<>();
        inicializarMenu();
    }

    private void inicializarMenu() {
        menu.add(new Cafe("Espresso", 2.0));
        menu.add(new Cafe("Latte", 3.5));
        menu.add(new Cafe("Cappuccino", 3.0));
        menu.add(new Cafe("Americano", 2.5));
        menu.add(new Cafe("Mocha", 4.0));
        menu.add(new Cafe("Macchiato", 3.5));
    }

    public void mostrarMenu() {
        System.out.println("Menú de Cafés:");
        for (Cafe cafe : menu) {
            System.out.println(cafe.getNombre() + " - $" + cafe.getPrecio());
        }
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        tienda.mostrarMenu();
    }
}

class Cafe {
    private String nombre;
    private double precio;

    public Cafe(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
