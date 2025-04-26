
package ChainOfResponsability;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Manejador basico = new SoporteBasico();
        Manejador avanzado = new SoporteAvanzado();
        Manejador gerente = new Gerente();

        basico.establecerSiguiente(avanzado);
        avanzado.establecerSiguiente(gerente);

        System.out.println("Sistema de soporte técnico:");
        System.out.println("Niveles disponibles: basico, avanzado, critico");
        System.out.println("Escriba 'salir' para terminar.");

        while (true) {
            System.out.print("\nIngrese el tipo de solicitud: ");
            String tipo = scanner.nextLine();

            if (tipo.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo del sistema...");
                break;
            }

            basico.manejarSolicitud(tipo);
        }

        scanner.close();
    }
}