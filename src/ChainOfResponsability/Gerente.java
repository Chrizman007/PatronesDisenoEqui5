
package ChainOfResponsability;

public class Gerente extends Manejador {
    @Override
    public void manejarSolicitud(String tipo) {
        if (tipo.equalsIgnoreCase("critico")) {
            System.out.println("El gerente se encarga del problema crítico.");
        } else {
            System.out.println("Nadie pudo manejar la solicitud.");
        }
    }
}