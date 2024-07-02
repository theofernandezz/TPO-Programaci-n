public class Cafe {
    //TODO: Agregar id al cafe
    private String nombre;
    private double precio;
    private String pais;
    private int id;

    // Constructor
    public Cafe(int id, String nombre, double precio, String pais) {
        this.nombre = nombre;
        this.precio = precio;
        this.pais = pais;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPais(String pais) { this.pais = pais; }
}
