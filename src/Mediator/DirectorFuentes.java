/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author chris
 */
import java.util.Scanner;

public class DirectorFuentes implements DirectorDialogo {
    private ListaDesplegable lista;
    private CampoTexto campoTexto;

    public DirectorFuentes() {
        this.lista = new ListaDesplegable(this);
        this.campoTexto = new CampoTexto(this);
    }

    @Override
    public void componenteModificado(Componente componente) {
        if (componente == lista) {
            campoTexto.setTexto(lista.getElementoSeleccionado());
        }
    }

    public void iniciarInteraccion() {
        Scanner scanner = new Scanner(System.in);
        lista.mostrarOpciones();

        while (true) {
            System.out.print("\nElige una opcion (1-3) o '0' para salir: ");
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                System.out.println("¡Hasta luego!");
                break;
            }
            lista.seleccionarElemento(opcion);
        }
        scanner.close();
    }
}
