/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronesdisenoequi5.Mediator;

/**
 *
 * @author chris
 */
import java.util.ArrayList;
import java.util.List;

public class ListaDesplegable extends Componente {
    private List<String> elementos = new ArrayList<>();
    private String elementoSeleccionado;

    public ListaDesplegable(DirectorDialogo director) {
        super(director);
    }

    public void seleccionarElemento(int indice) {
        this.elementoSeleccionado = elementos.get(indice);
        notificarCambio(); // Avisa al mediador
    }

    public String getElementoSeleccionado() {
        return elementoSeleccionado;
    }

    public void agregarElemento(String elemento) {
        elementos.add(elemento);
    }
}
