
package ChainOfResponsability;


public abstract class Manejador {
    protected Manejador siguiente;

    public void establecerSiguiente(Manejador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarSolicitud(String tipo);
}