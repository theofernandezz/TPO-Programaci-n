public class Main {
    public static void main(String[] args) {
        //Inicializar clases cafe
        Cafe Colombia = new Cafe("Cauca Tostado", 13500);
        Cafe Brasil = new Cafe("Sur de Minas Gerais", 13500);

        //Inicializar clase cliente prueba
        Cliente Cliente1 = new Cliente("Bruno Nehuen Cicerchia", "cicerchiabruno@gmail.com", "Capilla del señor 420", "+543489562010");

        //Inicializar clase Suscripcion Prueba
        Suscripcion Suscripcion1 = new Suscripcion(Colombia, 500, Cliente1);

        //Inicializar clase Dashboard
        Dashboard dashboard = new Dashboard();

        dashboard.agregarCafes(Colombia);
        dashboard.agregarCafes(Brasil);

        dashboard.agregarCliente(Cliente1);

        dashboard.agregarSuscripcion(Suscripcion1);

        System.out.println("Suscripciones activas:");
        for (Suscripcion s : dashboard.getSuscripciones()) {
            System.out.println(s.getCliente().getNombre() + " - " + s.getCafe().getNombre() + " - " + s.getCantidad() + " gramos");
        }

        System.out.println();

        System.out.println("Opciones de cafe:");
        for (Cafe s : dashboard.getCafes()) {
            System.out.println(s.getNombre());
        }


    }
}