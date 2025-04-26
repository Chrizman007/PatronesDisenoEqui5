/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mediator;

/**
 *
 * @author chris
 */
public class ListaDesplegable extends Componente {
    private String[] elementos = {"Arial", "Times New Roman", "Courier New"};
    private String elementoSeleccionado;

    public ListaDesplegable(DirectorDialogo director) {
        super(director);
    }

    public void mostrarOpciones() {
        System.out.println("\nOpciones disponibles:");
        for (int i = 0; i < elementos.length; i++) {
            System.out.println((i + 1) + ". " + elementos[i]);
        }
    }

    public void seleccionarElemento(int indice) {
        if (indice >= 1 && indice <= elementos.length) {
            this.elementoSeleccionado = elementos[indice - 1];
            notificarCambio();
        } else {
            System.out.println("¡Opción inválida!");
        }
    }

    public String getElementoSeleccionado() {
        return elementoSeleccionado;
    }
}
