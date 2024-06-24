public class Main {
    public static void main(String[] args) {
        // Crear un suscriptor
        Suscriptor suscriptor = new Suscriptor("Juan Pérez");

        // Crear métodos de pago
        MetodoPago tarjetaCredito = new MetodoPago("Tarjeta de Crédito");

        // Crear tipos de suscripción
        TipoSuscripcion mensual = new TipoSuscripcion(19.99);

        // Crear estados de suscripción
        EstadoSuscripcion activa = new EstadoSuscripcion("Activa");

        // Crear una suscripción y asociarla al suscriptor
        Suscripcion suscripcion = new Suscripcion(suscriptor, tarjetaCredito, mensual, activa);

        // Mostrar información del suscriptor y sus suscripciones
        System.out.println("Suscriptor: " + suscriptor.getNombre());
        for (Suscripcion s : suscriptor.getSuscripciones()) {
            System.out.println("Método de Pago: " + s.getMetodoPago().getMetodo());
            System.out.println("Tipo de Suscripción: " + s.getTipoSuscripcion().getPrecio());
            System.out.println("Estado de Suscripción: " + s.getEstadoSuscripcion().getEstado());
        }
    }
}
