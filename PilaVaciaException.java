/*Excepción lanzada al intentar pop o peek sobre una pila vacía. */

package JavaAplicacion;

public class PilaVaciaException extends Exception{
    public PilaVaciaException() {
        super("La pila está vacía. No se pueden realizar operaciones pop o peek.");
    }


    
}
