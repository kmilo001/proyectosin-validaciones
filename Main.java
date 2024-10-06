import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<EstIngenieria> ingenieros = new ArrayList<>();
        ArrayList<EstudianteDiseno> disenadores = new ArrayList<>();

        GestionPrestamos gestion = new GestionPrestamos(ingenieros, disenadores);
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** MENÚ PRINCIPAL ***");
            System.out.println("1. Estudiantes de Ingeniería");
            System.out.println("2. Estudiantes de Diseño");
            System.out.println("3. Imprimir Inventario Total");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuIngenieria(scanner, gestion);
                    break;
                case 2:
                    menuDiseno(scanner, gestion);
                    break;
                case 3:
                    imprimirInventario(ingenieros, disenadores);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }

    private static void menuIngenieria(Scanner scanner, GestionPrestamos gestion) {
        int opcion;
        do {
            System.out.println("\n*** MENÚ INGENIERÍA ***");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo");
            System.out.println("3. Devolución de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestion.registrarPrestamoIngenieria(scanner);
                    break;
                case 2:
                    gestion.modificarPrestamoIngenieria(scanner);
                    break;
                case 3:
                    gestion.devolverEquipoIngenieria(scanner);
                    break;
                case 4:
                    gestion.buscarEquipoIngenieria(scanner);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    private static void menuDiseno(Scanner scanner, GestionPrestamos gestion) {
        int opcion;
        do {
            System.out.println("\n*** MENÚ DISEÑO ***");
            System.out.println("1. Registrar préstamo de equipo");
            System.out.println("2. Modificar préstamo de equipo");
            System.out.println("3. Devolución de equipo");
            System.out.println("4. Buscar equipo");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestion.registrarPrestamoDiseno(scanner);
                    break;
                case 2:
                    gestion.modificarPrestamoDiseno(scanner);
                    break;
                case 3:
                    gestion.devolverEquipoDiseno(scanner);
                    break;
                case 4:
                    gestion.buscarEquipoDiseno(scanner);
                    break;
                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    private static void imprimirInventario(ArrayList<EstIngenieria> ingenieros, ArrayList<EstudianteDiseno> disenadores) {
        System.out.println("\n*** INVENTARIO TOTAL ***");
        System.out.println("Estudiantes de Ingeniería:");
        for (EstIngenieria est : ingenieros) {
            System.out.println(est.getNombre() + " - Serial: " + est.getSerial());
        }

        System.out.println("\nEstudiantes de Diseño:");
        for (EstudianteDiseno est : disenadores) {
            System.out.println(est.getNombre() + " - Serial: " + est.getSerial());
        }
    }
}
