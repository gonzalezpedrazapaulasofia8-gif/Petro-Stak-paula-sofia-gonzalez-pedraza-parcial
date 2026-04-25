/*Excepción lanzada al intentar push cuando se alcanza la capacidad máxima (si se usa arreglo). */

package JavaAplicacion;

public class PilaLlenaException extends Exception {

    public PilaLlenaException() {
        super("La pila está llena. No se pueden agregar más eventos.");
    }

    
    
}
