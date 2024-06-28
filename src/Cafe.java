public class Cafe {
    private String nombre;
    private double precio;
    private String pais;

    // Constructor
    public Cafe(String nombre, double precio, String pais) {
        this.nombre = nombre;
        this.precio = precio;
        this.pais = pais;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPais() { return pais; }

    public void setPais(String pais) { this.pais = pais; }
}
