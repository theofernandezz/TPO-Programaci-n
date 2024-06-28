public class Suscripcion {
    private Cafe cafe;
    private double cantidad;
    private Cliente cliente;

    public Suscripcion(Cafe cafe, double cantidad, Cliente cliente) {
        this.cafe = cafe;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }
}
