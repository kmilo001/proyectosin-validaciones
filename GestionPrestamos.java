import java.util.ArrayList;
import java.util.Scanner;

public class GestionPrestamos {
    
    private ArrayList<EstIngenieria> ingenieros;
    private ArrayList<EstudianteDiseno> disenadores;

    public GestionPrestamos(ArrayList<EstIngenieria> ingenieros, ArrayList<EstudianteDiseno> disenadores) {
        this.ingenieros = ingenieros;
        this.disenadores = disenadores;
    }

    public void registrarPrestamoIngenieria(Scanner scanner) {
        System.out.println("\n*** Registrar préstamo de equipo - Ingeniería ***");
        
        // Implementar el proceso de registro de préstamo para estudiantes de ingeniería
        System.out.print("Ingrese cédula: ");
        String cedula = scanner.next();
        
        if (buscarEstudianteIngenieriaPorCedula(cedula) != null) {
            System.out.println("El estudiante ya tiene un equipo en préstamo.");
            return;
        }
        
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.next();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.next();
        System.out.print("Ingrese teléfono: ");
        String telefono = scanner.next();
        System.out.print("Ingrese semestre: ");
        int semestre = scanner.nextInt();
        System.out.print("Ingrese promedio: ");
        Double promedio = scanner.nextDouble();
        System.out.print("Ingrese serial del equipo: ");
        String serial = scanner.next();
        
        // Crear un nuevo estudiante y añadirlo al vector
        EstIngenieria nuevoEstudiante = new EstIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, serial);
        ingenieros.add(nuevoEstudiante);
        System.out.println("Préstamo registrado con éxito.");
    }

    public void modificarPrestamoIngenieria(Scanner scanner) {
        System.out.println("\n*** Modificar préstamo de equipo - Ingeniería ***");
        System.out.print("Ingrese cédula o serial del equipo: ");
        String input = scanner.next();
        
        EstIngenieria estudiante = buscarEstudianteIngenieria(input);
        if (estudiante == null) {
            System.out.println("Estudiante o equipo no encontrado.");
            return;
        }
        
        System.out.println("Estudiante encontrado: " + estudiante.getNombre() + " " + estudiante.getApellido());
        System.out.print("Nuevo nombre: ");
        String nuevoNombre = scanner.next();
        estudiante.setNombre(nuevoNombre);
        System.out.print("Nuevo apellido: ");
        String nuevoApellido = scanner.next();
        estudiante.setApellido(nuevoApellido);
        System.out.println("Préstamo modificado con éxito.");
    }

    public void devolverEquipoIngenieria(Scanner scanner) {
        System.out.println("\n*** Devolución de equipo - Ingeniería ***");
        System.out.print("Ingrese cédula o serial del equipo: ");
        String input = scanner.next();
        
        EstIngenieria estudiante = buscarEstudianteIngenieria(input);
        if (estudiante != null) {
            ingenieros.remove(estudiante);
            System.out.println("Equipo devuelto con éxito.");
        } else {
            System.out.println("Estudiante o equipo no encontrado.");
        }
    }

    public void buscarEquipoIngenieria(Scanner scanner) {
        System.out.println("\n*** Buscar equipo - Ingeniería ***");
        System.out.print("Ingrese cédula o serial del equipo: ");
        String input = scanner.next();
        
        EstIngenieria estudiante = buscarEstudianteIngenieria(input);
        if (estudiante != null) {
            System.out.println("Estudiante encontrado: " + estudiante.getNombre() + " " + estudiante.getApellido() + 
                            " - Serial: " + estudiante.getSerial());
        } else {
            System.out.println("Estudiante o equipo no encontrado.");
        }
    }
    
    // Métodos de búsqueda
    private EstIngenieria buscarEstudianteIngenieria(String input) {
        for (EstIngenieria est : ingenieros) {
            if (est.getCedula().equals(input) || est.getSerial().equals(input)) {
                return est;
            }
        }
        return null;
    }

    private EstIngenieria buscarEstudianteIngenieriaPorCedula(String cedula) {
        for (EstIngenieria est : ingenieros) {
            if (est.getCedula().equals(cedula)) {
                return est;
            }
        }
        return null;
    }

public void registrarPrestamoDiseno(Scanner scanner) {
    System.out.println("\n*** Registrar préstamo de equipo - Diseño ***");
    
    System.out.print("Ingrese cédula: ");
    String cedula = scanner.next();
    
    if (buscarEstudianteDisenoPorCedula(cedula) != null) {
        System.out.println("El estudiante ya tiene un equipo en préstamo.");
        return;
    }
    
    System.out.print("Ingrese nombre: ");
    String nombre = scanner.next();
    System.out.print("Ingrese apellido: ");
    String apellido = scanner.next();
    System.out.print("Ingrese teléfono: ");
    String telefono = scanner.next();
    System.out.print("Ingrese modalidad de estudio (virtual/presencial): ");
    String modalidad = scanner.next();
    System.out.print("Ingrese cantidad de asignaturas que está viendo: ");
    int asignaturas = scanner.nextInt();
    System.out.print("Ingrese serial del equipo: ");
    String serial = scanner.next();
    
    // Crear un nuevo estudiante y añadirlo al vector
    EstudianteDiseno nuevoEstudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidad, asignaturas, serial);
    disenadores.add(nuevoEstudiante);
    System.out.println("Préstamo registrado con éxito.");
}

public void modificarPrestamoDiseno(Scanner scanner) {
    System.out.println("\n*** Modificar préstamo de equipo - Diseño ***");
    System.out.print("Ingrese cédula o serial del equipo: ");
    String input = scanner.next();
    
    EstudianteDiseno estudiante = buscarEstudianteDiseno(input);
    if (estudiante == null) {
        System.out.println("Estudiante o equipo no encontrado.");
        return;
    }
    
    System.out.println("Estudiante encontrado: " + estudiante.getNombre() + " " + estudiante.getApellido());
    
    System.out.print("Nuevo nombre: ");
    String nuevoNombre = scanner.next();
    estudiante.setNombre(nuevoNombre);
    
    System.out.print("Nuevo apellido: ");
    String nuevoApellido = scanner.next();
    estudiante.setApellido(nuevoApellido);
    
    System.out.print("Nueva modalidad de estudio: ");
    String nuevaModalidad = scanner.next();
    estudiante.setModalidad(nuevaModalidad);
    
    System.out.println("Préstamo modificado con éxito.");
}

public void devolverEquipoDiseno(Scanner scanner) {
    System.out.println("\n*** Devolución de equipo - Diseño ***");
    System.out.print("Ingrese cédula o serial del equipo: ");
    String input = scanner.next();
    
    EstudianteDiseno estudiante = buscarEstudianteDiseno(input);
    if (estudiante != null) {
        disenadores.remove(estudiante);
        System.out.println("Equipo devuelto con éxito.");
    } else {
        System.out.println("Estudiante o equipo no encontrado.");
    }
}

public void buscarEquipoDiseno(Scanner scanner) {
    System.out.println("\n*** Buscar equipo - Diseño ***");
    System.out.print("Ingrese cédula o serial del equipo: ");
    String input = scanner.next();
    
    EstudianteDiseno estudiante = buscarEstudianteDiseno(input);
    if (estudiante != null) {
        System.out.println("Estudiante encontrado: " + estudiante.getNombre() + " " + estudiante.getApellido() + 
                            " - Serial: " + estudiante.getSerial());
    } else {
        System.out.println("Estudiante o equipo no encontrado.");
    }
}

// Métodos de búsqueda
private EstudianteDiseno buscarEstudianteDiseno(String input) {
    for (EstudianteDiseno est : disenadores) {
        if (est.getCedula().equals(input) || String.valueOf(est.getSerial()).equals(input)) {
            return est;
        }
    }
    return null;
}

private EstudianteDiseno buscarEstudianteDisenoPorCedula(String cedula) {
    for (EstudianteDiseno est : disenadores) {
        if (est.getCedula().equals(cedula)) {
            return est;
        }
    }
    return null;
}
}