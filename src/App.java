import java.util.Scanner;

import servicios.CasaServicio;
import servicios.ClienteServicio;
import servicios.ComentarioServicio;
import servicios.EstanciaServicio;
import servicios.FamiliaServicio;

public class App {
    public static void main(String[] args) throws Exception {

        // pruebaDeServicios();        
        mostrarMenu();
    }

    public static void pruebaDeServicios() throws Exception{
        
        CasaServicio casaServicio = new CasaServicio();
        casaServicio.listarTodasLasCasas();

        ClienteServicio clienteServicio = new ClienteServicio();
        clienteServicio.listarTodosLosClientes();

        ComentarioServicio comentarioServicio = new ComentarioServicio();
        comentarioServicio.listarTodosLosComentarios();

        EstanciaServicio estanciaServicio = new EstanciaServicio();
        estanciaServicio.listarTodasLasEstancias();
        
        FamiliaServicio familiaServicio =  new FamiliaServicio();
        familiaServicio.listarTodasLasFamilias();
    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("----- Menú de Funcionalidades -----");
            System.out.println("1. Buscar familias con al menos 3 hijos y edad máxima inferior a 10 años");
            System.out.println("2. Buscar familias con dirección de email Hotmail");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            try {
                switch (opcion) {
                    case 1:
                        listarFamiliasConHijosMenores();
                        break;
                    case 2:
                        listarFamiliasConEmailHotmail();
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 3);

        scanner.close();
    }


    private static void listarFamiliasConHijosMenores() throws Exception {
        FamiliaServicio familiaServicio = new FamiliaServicio();
        familiaServicio.listarFamiliasConHijosMenores();
    }
    
    private static void listarFamiliasConEmailHotmail() throws Exception {
        FamiliaServicio familiaServicio = new FamiliaServicio();
        familiaServicio.listarFamiliasConEmailHotmail();
    }
}
