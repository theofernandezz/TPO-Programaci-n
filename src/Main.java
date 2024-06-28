import java.util.Scanner;

public class Main {

    //Scanner consola clase
    static Scanner scanner = new Scanner(System.in);
    //Inicializar clase Dashboard
    static Dashboard dashboard = new Dashboard();

    public static void main(String[] args) {
        //Inicializar clases cafe
        Cafe colombia = new Cafe("Cauca Tostado", 15000, "Colombia");
        Cafe brasil = new Cafe("Sur de Minas Gerais", 13500, "Brasil");
        Cafe guatemala = new Cafe("Huehuetenango", 16000, "Guatemala");
        Cafe costaRica = new Cafe("Tarrazu", 15000, "Costa Rica");
        Cafe etiopia = new Cafe("Guji Natural", 17000, "Etiopia");
        Cafe kenia = new Cafe("Muranga", 18000, "Kenia");

        //Inicializar clase cliente prueba
        Cliente cliente1 = new Cliente("Bruno Nehuen Cicerchia", "cicerchiabruno@gmail.com", "Capilla del señor 420, Campana, Buenos Aires", "+543489562010");
        Cliente cliente2 = new Cliente("Alberto Jose", "albertojose@gmail.com", "Alberdi 772, Escobar, Buenos Aires", "´+54011753910");
        Cliente cliente3 = new Cliente("Fernado Gonzalez", "fernandogonzalez@gmail.com", "Rawson 522, Pilar, Buenos Aires", "+543488392050");

        //Inicializar clase Suscripcion Prueba
        Suscripcion suscripcion1 = new Suscripcion(colombia, 500, cliente1);
        Suscripcion suscripcion2 = new Suscripcion(kenia, 1000, cliente2);
        Suscripcion suscripcion3 = new Suscripcion(brasil, 250, cliente3);

        dashboard.agregarCafes(colombia);
        dashboard.agregarCafes(brasil);
        dashboard.agregarCafes(guatemala);
        dashboard.agregarCafes(costaRica);
        dashboard.agregarCafes(etiopia);
        dashboard.agregarCafes(kenia);

        dashboard.agregarCliente(cliente1);
        dashboard.agregarCliente(cliente2);
        dashboard.agregarCliente(cliente3);

        dashboard.agregarSuscripcion(suscripcion1);
        dashboard.agregarSuscripcion(suscripcion2);
        dashboard.agregarSuscripcion(suscripcion3);

        //Inicio ejecucion programa
        //Impresion menu programa
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    verClientes();
                    break;
                case 2:
                    gestionarProductos();
                    break;
                case 3:
                    gestionarSuscripciones();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("Menú de Gestión de Suscripciones");
        System.out.println("1. Ver Clientes");
        System.out.println("2. Gestionar Productos");
        System.out.println("3. Gestionar Suscripciones");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static Cliente agregarCliente() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Correo Electrónico: ");
        String correo = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, correo, direccion, telefono);
        dashboard.agregarCliente(cliente);

        return cliente;
    }

    private static void verClientes() {
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : dashboard.getClientes()) {
            System.out.println(cliente.getNombre() + " - " + cliente.getCorreoElectronico());
        }
    }

    private static void gestionarProductos() {
        System.out.println("Gestión de Productos");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Ver Productos");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (opcion) {
            case 1:
                agregarProducto();
                break;
            case 2:
                verProductos();
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }

    private static void agregarProducto() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Precio: ");
        Double precio = scanner.nextDouble();
        System.out.print("Precio: ");
        String pais = scanner.nextLine();
        scanner.nextLine(); // Consumir la nueva línea
        Cafe productoNuevo = new Cafe(nombre, precio, pais);
        dashboard.agregarCafes(productoNuevo);

        System.out.println("Producto agregado exitosamente.");
    }

    private static void verProductos() {
        System.out.println("Lista de Productos:");
        for (Cafe producto : dashboard.getCafes()) {
            System.out.println(producto.getNombre() + " - " + producto.getPais() + " - $" + producto.getPrecio());
        }
    }

    private static void gestionarSuscripciones() {
        System.out.println("Gestión de Suscripciones");
        System.out.println("1. Agregar Suscripción");
        System.out.println("2. Ver Suscripciones");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        switch (opcion) {
            case 1:
                agregarSuscripcion();
                break;
            case 2:
                verSuscripciones();
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }

    private static void agregarSuscripcion() {
        Cliente nuevoCliente = agregarCliente();

        System.out.println("Seleccione el cafe elegido por le cliente:");
        System.out.println("Lista de Cafes:");
        for (Cafe producto : dashboard.getCafes()) {
            System.out.println(producto.getNombre() + " - " + producto.getPais() + " - $" + producto.getPrecio());
        }
        String nombreProducto = scanner.nextLine();
        Cafe producto = dashboard.getCafes().stream()
                .filter(p -> p.getNombre().equals(nombreProducto))
                .findFirst()
                .orElse(null);

        if (producto == null) {
            System.out.println("Producto no encontrado. Debe agregar el producto primero.");
            return;
        }

        System.out.println("Seleccione la cantidad de cafe mensual");
        Double cantidad = scanner.nextDouble();
        Suscripcion suscripcion = new Suscripcion(producto,  cantidad, nuevoCliente);
        dashboard.agregarSuscripcion(suscripcion);

        System.out.println("Suscripción agregada exitosamente.");
    }

    private static void verSuscripciones() {
        System.out.println("Lista de Suscripciones:");
        for (Suscripcion suscripcion : dashboard.getSuscripciones()) {
            System.out.println(suscripcion.getCliente().getNombre() + " - " + suscripcion.getCafe().getNombre() + " - " + suscripcion.getCantidad() + " gramos.");
        }
        
    }
}