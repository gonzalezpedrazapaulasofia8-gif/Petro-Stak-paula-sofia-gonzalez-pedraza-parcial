/*Lógica de negocio: orquesta la pila principal y la pila de Undo. Métodos: 
registrarEvento, revisarUltimo, retirarUltimo, deshacerUltimaAccion, listarEventos. */

package JavaAplicacion;

public class GestorInspecciones {
    
    private PilaEventos pilaPrincipal;
    private PilaEventos pilaUndo;

    public GestorInspecciones(int capacidad) {
        this.pilaPrincipal = new PilaEventos(capacidad);
        this.pilaUndo = new PilaEventos(capacidad);
    }

    // Métodos a implementar: registrarEvento, revisarUltimo, retirarUltimo, deshacerUltimaAccion, listarEventos.   

    public void registrarEvento(Inspeccion inspeccion) {
        try {
            pilaPrincipal.push(inspeccion);
            System.out.println("Evento registrado: " + inspeccion);
        } catch (PilaLlenaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void revisarUltimo() {
        try {
            Inspeccion ultimo = pilaPrincipal.peek();
            System.out.println("Último evento registrado: " + ultimo);
        } catch (PilaVaciaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void retirarUltimo() {
        try {
            Inspeccion retirado = pilaPrincipal.pop();
            pilaUndo.push(retirado);
            System.out.println("Evento retirado: " + retirado);
        } catch (PilaVaciaException | PilaLlenaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deshacerUltimaAccion() {
        try {
            Inspeccion deshecho = pilaUndo.pop();
            pilaPrincipal.push(deshecho);
            System.out.println("Última acción deshecha: " + deshecho);
        } catch (PilaVaciaException | PilaLlenaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listarEventos() {
        System.out.println("Eventos registrados (desde el más reciente):");
        pilaPrincipal.mostrarDesdeElTope();
    }



}