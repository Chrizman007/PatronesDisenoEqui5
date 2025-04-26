
package ChainOfResponsability;
public class SoporteAvanzado extends Manejador {
    @Override
    public void manejarSolicitud(String tipo) {
        if (tipo.equalsIgnoreCase("avanzado")) {
            System.out.println("Soporte avanzado se encarga del problema.");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(tipo);
        } else {
            System.out.println("Nadie pudo manejar la solicitud.");
        }
    }
}