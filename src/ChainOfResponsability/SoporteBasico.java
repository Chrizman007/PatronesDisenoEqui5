
package ChainOfResponsability;

public class SoporteBasico extends Manejador {
    @Override
    public void manejarSolicitud(String tipo) {
        if (tipo.equalsIgnoreCase("basico")) {
            System.out.println("Soporte básico se encarga del problema.");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(tipo);
        } else {
            System.out.println("Nadie pudo manejar la solicitud.");
        }
    }
}