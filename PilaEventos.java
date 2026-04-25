// Implementación de la pila desde cero con sus operaciones push, pop, peek, isEmpty, size, mostrarDesdeElTope.

package JavaAplicacion;

public class PilaEventos {
    
        private Inspeccion[] pila;
        private int tope;
        private int capacidad;
    
        public PilaEventos(int capacidad) {
            this.capacidad = capacidad;
            this.pila = new Inspeccion[capacidad];
            this.tope = -1;
        }
    
        public void push(Inspeccion inspeccion) throws PilaLlenaException {
            if (tope == capacidad - 1) {
                throw new PilaLlenaException();
            }
            pila[++tope] = inspeccion;
        }
    
        public Inspeccion pop() throws PilaVaciaException {
            if (isEmpty()) {
                throw new PilaVaciaException();
            }
            return pila[tope--];
        }
    
        public Inspeccion peek() throws PilaVaciaException {
            if (isEmpty()) {
                throw new PilaVaciaException();
            }
            return pila[tope];
        }
    
        public boolean isEmpty() {
            return tope == -1;
        }
    
        public int size() {
            return tope + 1;
        }
    
        public void mostrarDesdeElTope() {
            for (int i = tope; i >= 0; i--) {
                System.out.println(pila[i]);
            }
        }
    
}