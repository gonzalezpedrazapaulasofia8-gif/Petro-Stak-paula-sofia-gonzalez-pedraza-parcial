/*Capa de presentación: muestra menú, 
captura entrada con Scanner, valida y 
delega al GestorInspecciones. NO debe contener lógica de la pila. */

package JavaAplicacion;

import java.util.Scanner;

public class MenuConsola{

    public static void main(String[] args) {
        GestorInspecciones gestor = new GestorInspecciones(10); // Capacidad de la pila
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de Inspecciones:");
            System.out.println("1. Registrar nuevo evento de inspección");
            System.out.println("2. Revisar último evento registrado");
            System.out.println("3. Retirar último evento registrado");
            System.out.println("4. Deshacer última acción");
            System.out.println("5. Listar eventos registrados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
       
            switch (opcion) {
                case 1:
                    System.out.print("Código del pozo: ");
                    String codigoPozo = scanner.nextLine();
                    System.out.print("Municipio: ");
                    String municipio = scanner.nextLine();
                    System.out.print("Tipo de evento: ");
                    String tipoEvento = scanner.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Fecha-hora: ");
                    String fechaHora = scanner.nextLine();
                    
                    Inspeccion nuevaInspeccion = new Inspeccion(codigoPozo, municipio, tipoEvento, descripcion, fechaHora);
                    gestor.registrarEvento(nuevaInspeccion);
                    break;
                case 2:
                    gestor.revisarUltimo();
                    break;
                case 3:
                    gestor.retirarUltimo();
                    break;
                case 4:
                    gestor.deshacerUltimaAccion();
                    break;
                case 5:
                    gestor.listarEventos();
                    break;
                case 0:
                    // Se sale del programa al terminar el ciclo.
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);

        System.out.println("Saliendo del programa...");
        scanner.close();
    }
    
}